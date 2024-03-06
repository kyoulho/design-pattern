package proxy;

// 2. RealSubject: 실제 이미지 로딩을 담당하는 클래스
class RealImage implements Image {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading image from disk: " + filename);
        // 실제 이미지 로딩 로직
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
        // 실제 이미지 출력 로직
    }
}
