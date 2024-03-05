package adapter;

// 클라이언트 코드
public class Client {
    public static void main(String[] args) {
        // 기존의 코드 사용
        IntReturningInterface oldLibrary = new IntReturningClass();

        // 어댑터를 통해 새로운 인터페이스로 연결
        StringReturningInterface adapter = new StringReturningAdapter(oldLibrary);

        // 클라이언트는 어댑터를 통해 새로운 인터페이스를 사용
        String numberStr = adapter.getStrValue();
        System.out.println(numberStr);
    }
}
