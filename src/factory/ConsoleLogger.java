package factory;

// 콘솔에 로그를 출력하는 Logger 구현 클래스
public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Console Log: " + message);
    }
}
