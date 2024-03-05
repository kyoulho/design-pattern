package factory;

// 파일에 로그를 기록하는 Logger 구현 클래스
public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("File Log: " + message);
    }
}
