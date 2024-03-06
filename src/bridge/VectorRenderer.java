package bridge;

class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(double x, double y, double radius) {
        System.out.printf("VectorRenderer.circle at %f:%f radius %f%n", x, y, radius);
    }
}
