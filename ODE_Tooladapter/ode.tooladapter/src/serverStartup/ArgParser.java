package serverStartup;

import org.apache.logging.log4j.Level;
import picocli.CommandLine;
import picocli.CommandLine.Option;

import java.io.File;

@CommandLine.Command(name = "ODE Tool Adapter Server (DEIS Project)", footer = "Copyright(c) 2018",
        description = "Start and configure the ODE Tool Adapter Server.")
public class ArgParser
{
    @Option(names = {"-loglevel"}, description = "Define log level (ERROR, WARN, INFO, DEBUG, TRACE) of the logs that are written to the specified log file. Default: DEBUG")
    private String logLevel = "DEBUG";

    @Option(names = {"-logfile"}, description = "Log file path.")
    private File logfile;

    @Option(names = {"-server-port"}, description = "Port of the ODE Tool Adapter Server. Default: 1400")
    private int serverPort = 1339;

    @Option(names = {"-help"}, description = "Show help.")
    private boolean help = false;


    public Level getLogLevel()
    {
        return Level.toLevel(logLevel, Level.DEBUG);
    }

    public File getLogfile()
    {
        return logfile;
    }

    public int getServerPort()
    {
        return serverPort;
    }

    public boolean isHelp()
    {
        return help;
    }
}
