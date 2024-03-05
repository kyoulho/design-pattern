package strategy;

    /*
        - Duck의 하위 클래스들이 인터페이스를 구현하도록 한다면, 각 하위 클래스마다 특정 행동을 강제하는 것이 되어
          오리의 종류가 늘어날 때마다 인터페이스 구현의 변경이 필요함.
        - 반면에 멤버 변수로 갖고 있다면, 각 하위 클래스는 실행 중에 행동을 동적으로 변경할 수 있어서
          새로운 오리를 추가하거나 행동을 바꾸는 데 유연성을 제공함.
        - 또한, 이 방식은 상속과 구성을 함께 사용하는 디자인 원칙인 '구성(composition)을 통한 재사용'을 지향함.
    */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
