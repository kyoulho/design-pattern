package bridge;

public class BridgePatternExample {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        new Circle(1, 2, 3, vectorRenderer).draw();
        new Circle(5, 7, 11, rasterRenderer).draw();
    }
}
