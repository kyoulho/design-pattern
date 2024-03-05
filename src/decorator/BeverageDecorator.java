package decorator;

// Decorator
abstract class BeverageDecorator extends Beverage {
    protected Beverage decoratedCoffee;

    public BeverageDecorator(Beverage decoratedCoffee) {
        super(decoratedCoffee.getSize());
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost();
    }
}
