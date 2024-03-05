package factory;

// 구체적인 로거
class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Log to console: " + message);
    }
}
