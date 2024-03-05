package factory;

// DIP를 준수하기 위한 고수준 모듈
abstract class LoggerFactory {

    abstract Logger createLogger();
}
