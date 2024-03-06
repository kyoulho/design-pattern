package chainofresponsibility;

// 클라이언트 클래스
public class Client {
    public static void main(String[] args) {
        Logger logger = new LoggerHandler();
        Logger consoleLogger = new ConsoleLogger();
        consoleLogger.setNextLogger(new FileLogger());
        logger.setNextLogger(consoleLogger);

        // 클라이언트에서 로그 요청
        consoleLogger.handleLog(LogLevel.INFO, "This is an information message.", null);
        consoleLogger.handleLog(LogLevel.ERROR, "This is an error message.", null);
    }
}
