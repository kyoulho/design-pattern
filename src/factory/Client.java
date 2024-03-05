package factory;

// 고수준 모듈의 클라이언트 코드
public class Client {
    public static void main(String[] args) {
        LoggerFactory factory = new ConsoleLoggerFactory();  // 추상화에 의존
        Logger logger = factory.createLogger();
        logger.log("hi!!");
    }
}

