package adapter;

class StringReturningAdapter implements StringReturningInterface {
    private final IntReturningInterface intReturningObject;

    public StringReturningAdapter(IntReturningInterface intReturningObject) {
        this.intReturningObject = intReturningObject;
    }

    @Override
    public String getStrValue() {
        return String.valueOf(intReturningObject.getIntValue());
    }
}
