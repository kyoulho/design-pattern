package decorator;

// ConcreteComponent
class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "순한 커피";
    }

    @Override
    public double cost() {
        return 3.0;
    }
}