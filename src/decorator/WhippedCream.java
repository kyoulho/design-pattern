package decorator;

class WhippedCream extends BeverageDecorator {
    public WhippedCream(Beverage decoratedCoffee) {
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
