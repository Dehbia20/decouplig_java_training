package fr.lernejo.logger;

public abstract class LoggerFactory{
    public Logger getLogger(String name){
        return new ConsoleLogger();
    }
}
