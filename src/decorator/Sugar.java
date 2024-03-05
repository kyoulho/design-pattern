package decorator;

class Sugar extends CoffeeDecorator {
    public Sugar(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", 설탕";
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }
}
