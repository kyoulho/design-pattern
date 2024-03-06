package mediator;

// 클라이언트 코드
public class Client {
    public static void main(String[] args) {
        ComputerMediator mediator = new ConcreteMediator();

        Colleague cpu = new CPU(mediator);
        Colleague memory = new Memory(mediator);
        Colleague graphicsCard = new GraphicsCard(mediator);

        mediator.add(cpu);
        mediator.add(memory);
        mediator.add(graphicsCard);

        cpu.send("Data to process");
    }
}
