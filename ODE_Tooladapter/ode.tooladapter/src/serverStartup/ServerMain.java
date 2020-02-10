package serverStartup;

import static util.FormatUtils.format;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TFileTransport.TruncableBufferedInputStream;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TFramedTransport.Factory;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportFactory;

import picocli.CommandLine;
import serviceImpl.DDIServiceHandler;
import thriftContract.DDIService;

public class ServerMain
{
    private static final Logger log = LogManager.getLogger(ServerMain.class);

    private static Thread shutdownHook = new Thread(() -> log.info("Shutting down JVM."));

    public static void main(String[] args)
    {
    	Handler handler = new Handler();
        Thread.setDefaultUncaughtExceptionHandler(handler);
        Runtime.getRuntime().addShutdownHook(shutdownHook);

        log.info(Constants.Application.appName + getJarBuildDate());
        log.info("");
        log.info("Arguments: {}", Arrays.toString(args));
        ArgParser parser = null;
        try {
            parser = CommandLine.populateCommand(new ArgParser(), args);
        } catch (Exception e) {
            log.error("Parsing the arguments caused an exception!", e);
            System.exit(Constants.ErrorCodes.errorCodeInvalidApplicationArguments);
        }
        if (parser.isHelp()) {
            CommandLine.usage(new ArgParser(), System.out);
            System.exit(Constants.ErrorCodes.errorCodeNormalTermination);
        }
        File logFile = parser.getLogfile();
        if (logFile != null) {
            try {
                String fullPath = logFile.getCanonicalPath();
                //LogConfig.addFileAppender("CustomAppender", fullPath, parser.getLogLevel(), true);
                //log.info("Started logging to the file at {}", fullPath);
            } catch (IOException e) {
                log.error(format("The file path {} cannot be used for logging!", logFile), e);
            }
        }

        // start server
        try {
        	
        	TServerSocket serverTransport = new TServerSocket(parser.getServerPort());
    		
        	TTransportFactory framedServerTransport = new TFramedTransport.Factory();
        	
        	
        	
        	DDIServiceHandler ddiExchangeHandler = new DDIServiceHandler();
        	DDIService.Processor<DDIServiceHandler> ddiExchangeProcessor = new DDIService.Processor<>(ddiExchangeHandler);
        	
    		TThreadPoolServer server = new TThreadPoolServer(new TThreadPoolServer.Args(serverTransport).processor(ddiExchangeProcessor).inputProtocolFactory(new CustomProtocolFactory()));
    		server.serve();
        } catch (Exception e) {
            log.error("An exception occurred while starting the Server.", e);
            System.exit(Constants.ErrorCodes.errorCodeManagementServerError);
        } finally {
        }
        log.info("Server running.");
    }

    private static class Handler implements Thread.UncaughtExceptionHandler
    {
        public void uncaughtException(Thread t, Throwable e)
        {
            log.error("An uncaught exception has occurred in the Thread: " + t, e);
            log.warn("Such exceptions are usually caused by coding mistakes!");
        }
    }

    private static String getJarBuildDate()
    {
        long manifestTime = 0;
        try {
            String path = ServerMain.class.getProtectionDomain().getCodeSource().getLocation().getPath();
            String decodedPath = URLDecoder.decode(path, "UTF-8");
            File serverExecutable = new File(decodedPath);
            try (JarFile jf = new JarFile(serverExecutable)) {
                ZipEntry manifest = jf.getEntry("META-INF/MANIFEST.MF");
                manifestTime = manifest.getTime();  //in standard millis
            } catch (IOException e1) {
                log.debug("An exception occurred while getting the build date!", e1);
            }
        } catch (UnsupportedEncodingException ex) {
            log.debug("An exception occurred while getting the build date!", ex);
        }
        if (manifestTime == 0) return "";
        Instant instant = Instant.ofEpochMilli(manifestTime);
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        LocalDate buildDate = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate();
        String dateString = buildDate.format(formatter);
        return " (built " + dateString + ")";
    }
}
