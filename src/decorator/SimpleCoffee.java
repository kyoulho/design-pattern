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
        switch (size) {
            case GRADE -> {
                return 3.0;
            }
            case VENTI -> {
                return 3.2;
            }
            default -> {
                return 2.8;
            }
        }
    }
}