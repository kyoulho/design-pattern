package factory;

// 콘솔 로깅에 사용될 Logger를 생성하는 팩토리 클래스
public class ConsoleLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}
