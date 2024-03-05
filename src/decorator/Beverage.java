package decorator;

// Component
abstract class Beverage {
    enum Size {
        TALL, GRADE, VENTI
    }

    protected Size size;

    public Beverage(Size size) {
        this.size = size;
    }

    abstract String getDescription();

    public Size getSize() {
        return size;
    }

    abstract double cost();
}