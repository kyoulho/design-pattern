package bridge;

class Circle extends Shape {
    private final double x, y, radius;

    public Circle(double x, double y, double radius, Renderer renderer) {
        super(renderer);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    void draw() {
        renderer.renderCircle(x, y, radius);
    }
}
