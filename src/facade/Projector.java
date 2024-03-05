package facade;

// 프로젝터 클래스
class Projector {
    private final Screen screen;

    public Projector(Screen screen) {
        this.screen = screen;
    }

    public void screenDown() {
        screen.down();
    }

    public void screenUP() {
        screen.up();
    }

    public void turnOn() {
        System.out.println("프로젝터를 켭니다.");
    }

    public void turnOff() {
        System.out.println("프로젝터를 끕니다.");
    }
}
