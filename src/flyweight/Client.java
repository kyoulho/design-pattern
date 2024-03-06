package flyweight;

// 클라이언트 클래스
public class Client {
    public static void main(String[] args) {
        TextFlyweightFactory factory = new TextFlyweightFactory();

        String text = "Hello, Flyweight Pattern!";
        char[] characters = text.toCharArray();

        for (char character : characters) {
            TextFlyweight flyweight = factory.getFlyweight(character);
            flyweight.print("ExternalState"); // 동일한 플라이웨이트 인스턴스를 여러 번 재사용
        }
    }
}
