package chainofresponsibility;

// Handler 인터페이스
interface Logger {
    void handleLog(LogLevel level, String message, Object[] params);

    void setNextLogger(Logger nextLogger);
}
