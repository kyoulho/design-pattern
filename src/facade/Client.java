package facade;

// 클라이언트 코드
public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(new Projector(new Screen()), new AudioAmp(), new DvdPlayer());

        // 영화 감상 시작
        homeTheater.watchMovie();

        // 영화 감상 종료
        homeTheater.endMovie();
    }
}
