package templatemethod;

// AbstractClass: 음료를 만드는 알고리즘의 템플릿을 정의하는 클래스
abstract class BeverageTemplate {
    // 템플릿 메소드: 알고리즘의 구조를 정의
    final void makeBeverage() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    // 일부 단계는 추상 메소드로 선언하여 서브클래스에서 구현
    abstract void brew();

    abstract void addCondiments();

    // 구현된 후크 메소드
    void boilWater() {
        System.out.println("물 끓이는 중");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    // 선택적으로 오버라이드할 후크 메소드
    boolean customerWantsCondiments() {
        return true;
    }
}
