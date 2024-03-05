package command;

// ConcreteCommand 클래스 - 램프를 끄는 명령
class LampOffCommand implements Command {
    private final Lamp lamp;

    public LampOffCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOff();
    }

    @Override
    public void undo() {
        lamp.turnOn();
    }
}
