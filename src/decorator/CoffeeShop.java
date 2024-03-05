package decorator;


public class CoffeeShop {
    public static void main(String[] args) {
        // 기본 커피 생성
        Coffee myCoffee = new SimpleCoffee();
        System.out.println("기본 커피: " + myCoffee.getDescription() + ", 가격: $" + myCoffee.cost());

        // 휘핑 크림 추가
        myCoffee = new WhippedCream(myCoffee);
        System.out.println("휘핑 크림 추가한 커피: " + myCoffee.getDescription() + ", 가격: $" + myCoffee.cost());

        // 설탕과 우유 추가
        myCoffee = new Sugar(myCoffee);
        myCoffee = new Milk(myCoffee);
        System.out.println("설탕과 우유 추가한 커피: " + myCoffee.getDescription() + ", 가격: $" + myCoffee.cost());
    }
}
