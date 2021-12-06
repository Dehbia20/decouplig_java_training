package fr.lernejo.logger;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class ContextualLogger implements Logger{
    String callerClass;
    Logger delegateLogger;

    public ContextualLogger(String callerClass, Logger logger) {
        this.callerClass = callerClass;
        this.delegateLogger = logger;
    }


    @Override
    public void log(String message) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        delegateLogger.log(LocalDateTime.now().format(format) + " " + callerClass + " " + message);
    }
}
