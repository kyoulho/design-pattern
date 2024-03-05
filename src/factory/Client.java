package factory;

// 클라이언트 코드
public class Client {
    public static void main(String[] args) {
        // Console Logger 사용
        LoggerFactory consoleLoggerFactory = new ConsoleLoggerFactory();
        Logger consoleLogger = consoleLoggerFactory.createLogger();
        consoleLogger.log("This is a console log message.");

        // File Logger 사용
        LoggerFactory fileLoggerFactory = new FileLoggerFactory();
        Logger fileLogger = fileLoggerFactory.createLogger();
        fileLogger.log("This is a file log message.");
    }
}


