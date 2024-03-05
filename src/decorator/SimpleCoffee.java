package decorator;

// ConcreteComponent
class SimpleCoffee extends Beverage {
    public SimpleCoffee(Size size) {
        super(size);
    }

    @Override
    public String getDescription() {
        return "순한 커피 %s 사이즈".formatted(size);
    }

    @Override
    public double cost() {
        return 3.0;
    }
}