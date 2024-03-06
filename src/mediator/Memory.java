package mediator;

class Memory implements Colleague {
    private final ComputerMediator mediator;

    public Memory(ComputerMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void receive(String message) {
        System.out.println("Memory received: " + message);
    }

    @Override
    public void send(String message) {
        System.out.println("Memory sending: " + message);
        mediator.send(message, this);
    }
}
