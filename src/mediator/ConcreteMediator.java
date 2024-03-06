package mediator;

import java.util.ArrayList;
import java.util.List;

// ConcreteMediator 클래스
class ConcreteMediator implements ComputerMediator {
    List<Colleague> colleagues;

    public ConcreteMediator() {
        this.colleagues = new ArrayList<>();
    }

    @Override
    public void add(Colleague colleague) {
        this.colleagues.add(colleague);
    }

    @Override
    public void send(String message, Colleague colleague) {
        for (Colleague colleague1 : colleagues) {
            if (colleague.equals(colleague)) {
                colleague1.receive(message);
            }
        }
    }
}
