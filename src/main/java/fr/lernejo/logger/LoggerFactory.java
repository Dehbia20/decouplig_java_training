package fr.lernejo.logger;

public abstract class LoggerFactory{
    public static Logger getLogger(String name){
        return new ConsoleLogger();
    }
}
