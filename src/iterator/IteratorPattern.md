# 반복자 패턴

---

반복자 패턴을 사용하면 내부 구현 방법을 외부로 노출하지 않으면서
집합체에 있는 모든 항목에 일일이 접근할 수 있다.

또한 각 항목에 일일이 접근할 수 있게 해주는 기능을 집합체가 아닌
반복자 객체가 책임진다는 장점도 있다. 그러면 집합체 인터페이스와 구현이 간단해지고,
각자에게 중요한 일만을 처리할 수 있게 된다.


### 반복자 패턴의 구성 요소:
1. **Iterator (반복자):**
   - 집합 객체를 순회하면서 각 요소에 접근하는 인터페이스를 정의한다.
   - 요소에 접근하고 순회를 관리하기 위한 메소드들을 포함한다.
2. **ConcreteIterator (구체적인 반복자):**
   - Iterator 인터페이스를 구현하여 실제 순회 동작을 구현한다.
   - 현재 위치를 추적하고 다음 요소로 이동하는 등의 기능을 제공한다.
3. **Aggregate (집합 객체):**
   - 객체들의 집합을 나타내는 인터페이스를 정의한다.
   - 반복자를 생성하는 메소드를 포함한다.
4. **ConcreteAggregate (구체적인 집합 객체):**
   - Aggregate 인터페이스를 구현하여 실제 집합 객체를 생성한다.
   - 구체적인 요소들을 포함하고, 해당 요소들에 대한 반복자를 생성하는 메소드를 제공한다.