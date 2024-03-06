package flyweight;

// ConcreteFlyweight 클래스
class CharacterFlyweight implements TextFlyweight {
    private final char character;

    public CharacterFlyweight(char character) {
        this.character = character;
    }

    @Override
    public void print(String externalState) {
        System.out.print(character + externalState + " ");
    }
}
