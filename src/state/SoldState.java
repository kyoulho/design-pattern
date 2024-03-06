package state;

public class SoldState implements State {
    private final GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("알맹이를 내보내고 있습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("이미 알맹이를 뽑았습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("알맹이를 내보내고 있습니다.");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.changeState(StateEnum.NO_QUARTER);
        } else {
            System.out.println("알맹이가 없습니다.");
            gumballMachine.changeState(StateEnum.SOLD_OUT);
        }
    }
}
