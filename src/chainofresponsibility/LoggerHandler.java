package chainofresponsibility;

public class LoggerHandler implements Logger {
    private Logger nextLogger;

    @Override
    public void handleLog(LogLevel level, String message, Object[] params) {
        nextLogger.handleLog(level, message, params);
    }


    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }
}
