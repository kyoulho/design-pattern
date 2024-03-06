package state;

import java.util.Map;

public class GumballMachine {

    private final Map<StateEnum, State> stateMap = Map.of(
            StateEnum.SOLD_OUT, new SoldOutState(this),
            StateEnum.NO_QUARTER, new NoQuarterState(this),
            StateEnum.HAS_QUARTER, new HasQuarterState(this),
            StateEnum.SOLD, new SoldState(this)
    );

    private State state;
    private int count;

    public GumballMachine(int numberGumballs) {
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = stateMap.get(StateEnum.NO_QUARTER);
        } else {
            state = stateMap.get(StateEnum.SOLD);
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("알맹이를 내보내고 있습니다.");
        if (count > 0) {
            count = count - 1;
        }
    }

    public void changeState(StateEnum stateEnum) {
        this.state = stateMap.get(stateEnum);
    }

    public int getCount() {
        return this.count;
    }
}
