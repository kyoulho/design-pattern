package chainofresponsibility;

// ConcreteHandler 클래스 - 각 로그 레벨에 따라 처리
class ConsoleLogger implements Logger {
    private Logger nextLogger;

    @Override
    public void handleLog(LogLevel level, String message, Object[] params) {
        if (level == LogLevel.INFO) {
            System.out.println("Console: " + String.format(message, params));
        } else if (nextLogger != null) {
            nextLogger.handleLog(level, message, params);
        }
    }

    @Override
    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }
}
