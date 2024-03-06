package flyweight;

import java.util.HashMap;
import java.util.Map;

// FlyweightFactory 클래스
class TextFlyweightFactory {
    private final Map<Character, TextFlyweight> flyweights = new HashMap<>();

    public TextFlyweight getFlyweight(char character) {
        return flyweights.computeIfAbsent(character, CharacterFlyweight::new);
    }
}
