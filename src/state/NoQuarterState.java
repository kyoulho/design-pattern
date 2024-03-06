package state;

public class NoQuarterState implements State {
    private final GumballMachine gumballMachine;

    NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전을 넣으셨습니다.");
        gumballMachine.changeState(StateEnum.HAS_QUARTER);
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣어 주세요.");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전을 넣어 주세요.");
    }

    @Override
    public void dispense() {
        System.out.println("동전을 넣어 주세요.");
    }
}
