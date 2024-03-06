package mediator;

// Mediator 인터페이스
interface ComputerMediator {
    void add(Colleague colleague);

    void send(String message, Colleague colleague);
}
