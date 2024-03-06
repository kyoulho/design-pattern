package mediator;

class GraphicsCard implements Colleague {
    private final ComputerMediator mediator;

    public GraphicsCard(ComputerMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void receive(String message) {
        System.out.println("Graphics Card received: " + message);
    }

    @Override
    public void send(String message) {
        System.out.println("Graphics Card sending: " + message);
        mediator.send(message, this);
    }
}
