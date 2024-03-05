package command;

// ConcreteCommand 클래스 - 램프를 켜는 명령
class LampOnCommand implements Command {
    private final Lamp lamp;

    public LampOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOn();
    }

    @Override
    public void undo() {
        lamp.turnOff();
    }
}
