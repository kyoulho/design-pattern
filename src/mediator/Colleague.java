package mediator;

// Colleague 인터페이스
interface Colleague {
    void receive(String message);

    void send(String message);
}
