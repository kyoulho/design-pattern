package bridge;

class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(double x, double y, double radius) {
        System.out.printf("RasterRenderer.circle at %f:%f radius %f%n", x, y, radius);
    }
}
