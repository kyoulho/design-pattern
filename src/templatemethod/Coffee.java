package templatemethod;

import java.util.Locale;
import java.util.Scanner;

// ConcreteClass: 추상 클래스를 상속받아 구체적인 동작을 구현하는 클래스
class Coffee extends BeverageTemplate {
    @Override
    void brew() {
        System.out.println("커피를 내리는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("설탕과 우유를 추가하는 중");
    }

    // 후크 메소드를 오버라이드하여 선택적으로 동작을 변경
    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase(Locale.ROOT).equals("y");
    }

    private String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("커피에 우유와 설탕을 넣을까요? (y/n)");
        return scanner.next();
    }
}
