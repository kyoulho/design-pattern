package facade;

// 홈 시어터 퍼사드 클래스
class HomeTheaterFacade {
    private final Projector projector;
    private final AudioAmp audioAmp;
    private final DvdPlayer dvdPlayer;

    public HomeTheaterFacade(Projector projector, AudioAmp audioAmp, DvdPlayer dvdPlayer) {
        this.projector = projector;
        this.audioAmp = audioAmp;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie() {
        System.out.println("영화 감상을 시작합니다.");
        projector.screenDown();
        projector.turnOn();
        audioAmp.turnOn();
        dvdPlayer.turnOn();
    }

    public void endMovie() {
        System.out.println("영화 감상을 종료합니다.");
        projector.turnOff();
        projector.screenUP();
        audioAmp.turnOff();
        dvdPlayer.turnOff();
    }
}
