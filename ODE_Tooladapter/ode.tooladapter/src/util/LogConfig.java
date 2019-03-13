package util;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.RandomAccessFileAppender;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.apache.logging.log4j.core.layout.PatternLayout;

public class LogConfig
{
    public static void addFileAppender(String appenderName, String fileName, Level logLevel, boolean onlyTime) {
        final LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
        final Configuration config = ctx.getConfiguration();
        String datePattern = onlyTime ? "%d{ABSOLUTE}" : "%d{ISO8601}";
        @SuppressWarnings("rawtypes")
		Layout layout = PatternLayout.newBuilder().withPattern("[%-5level] " + datePattern + " %c{1} - %msg%n").build();
        @SuppressWarnings("unchecked")
		Appender appender = RandomAccessFileAppender.newBuilder().setFileName(fileName).setAppend(true).withName(appenderName).withImmediateFlush(false).withLayout(layout).build();
        appender.start();
        config.addAppender(appender);
        LoggerConfig loggerConfig = config.getRootLogger();
        loggerConfig.addAppender(appender, logLevel, null);
        ctx.updateLoggers();
    }
}
