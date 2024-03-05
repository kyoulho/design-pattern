package factory;

// 파일 로깅에 사용될 Logger를 생성하는 팩토리 클래스
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
