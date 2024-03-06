package proxy;

// Client: 이미지를 사용하는 클라이언트 코드
public class ProxyPatternExample {
    public static void main(String[] args) {
        // 이미지 로딩 시간을 측정하는 프록시를 사용
        Image image = new ImageProxy("example.jpg");

        // 이미지 출력 요청
        image.display();
        
        // 이미지가 이미 로딩되어 있기 때문에 두 번째 호출에서는 측정하지 않음
        image.display();
    }
}
