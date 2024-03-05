package decorator;

class WhippedCream extends CoffeeDecorator {
    public WhippedCream(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", 휘핑 크림";
    }

    @Override
    public double cost() {
        return super.cost() + 1.5;
    }
}
