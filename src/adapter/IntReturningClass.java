package adapter;

// IntReturningInterface를 구현하는 클래스
class IntReturningClass implements IntReturningInterface {
    @Override
    public int getIntValue() {
        return 42;
    }
}
