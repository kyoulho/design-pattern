package mediator;

// ConcreteColleague 클래스
class CPU implements Colleague {
    private final ComputerMediator mediator;

    public CPU(ComputerMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void receive(String message) {
        System.out.println("CPU received: " + message);
    }

    @Override
    public void send(String message) {
        System.out.println("CPU sending: " + message);
        mediator.send(message, this);
    }
}
