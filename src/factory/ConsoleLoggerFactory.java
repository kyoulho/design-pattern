package factory;

// 구체적인 로거를 생성하는 구체적인 팩토리
class ConsoleLoggerFactory extends LoggerFactory {
    @Override
    Logger createLogger() {
        return new ConsoleLogger();  // 추상화에 의존
    }
}
