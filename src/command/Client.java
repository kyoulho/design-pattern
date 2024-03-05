package command;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 클라이언트 코드
public class Client {
    public static void main(String[] args) {
        // 수신자 객체 생성
        Lamp lamp = new Lamp();

        // 명령 객체 생성
        Command lampOnCommand = new LampOnCommand(lamp);
        Command lampOffCommand = new LampOffCommand(lamp);

        // 호출자 객체 생성 및 명령 설정
        RemoteControl remote = new RemoteControl();
        remote.setCommand(lampOnCommand);

        // 버튼 누르기
        remote.pressButton();

        // 다른 명령으로 설정 후 버튼 누르기
        remote.setCommand(lampOffCommand);
        remote.pressButton();

        // Undo 버튼 누르기
        remote.pressUndoButton();
    }
}
