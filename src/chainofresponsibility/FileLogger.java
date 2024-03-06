package chainofresponsibility;

class FileLogger implements Logger {
    private Logger nextLogger;

    @Override
    public void handleLog(LogLevel level, String message, Object[] params) {
        if (level == LogLevel.ERROR) {
            System.out.println("File: " + String.format(message, params));
        } else if (nextLogger != null) {
            nextLogger.handleLog(level, message, params);
        }
    }

    @Override
    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }
}
