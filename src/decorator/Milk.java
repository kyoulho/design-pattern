package decorator;

// ConcreteDecorator
class Milk extends CoffeeDecorator {
    public Milk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", 우유";
    }

    @Override
    public double cost() {
        return super.cost() + 1.0;
    }
}
