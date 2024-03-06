package proxy;

// 3. Proxy: RealSubject에 대한 접근을 제어하고 확장하는 클래스
class ImageProxy implements Image {
    private RealImage realImage;
    private final String filename;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            // 프록시에서 실제 이미지 로딩을 수행
            realImage = new RealImage(filename);
        }

        // 프록시에서는 실제 이미지에 대한 추가적인 작업 수행 가능
        System.out.println("Image loading time measured.");

        // 실제 이미지 출력 로직은 RealSubject에 위임
        realImage.display();
    }
}
