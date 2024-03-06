package templatemethod;

// 클라이언트
public class Client {
    public static void main(String[] args) {
        // Coffee를 만드는 알고리즘 수행
        BeverageTemplate coffee = new Coffee();
        coffee.makeBeverage();
    }
}
