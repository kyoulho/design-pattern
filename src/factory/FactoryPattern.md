# 팩토리 패턴

---

팩토리 패턴(Factory Pattern)은 객체 생성을 캡슐화하고, 클라이언트 코드에서 어떤 클래스의 인스턴스를 생성할지 결정하는 패턴이다.

이는 객체의 생성을 추상화하여 시스템의 유연성과 확장성을 향상시키며, 객체 생성 코드를 클라이언트 코드로부터 분리한다.


## 팩토리 패턴의 종류

1. **간단한 팩토리 패턴(Simple Factory Pattern):**
   - 하나의 팩토리 클래스가 객체의 생성을 담당하는 방식.
   - 클라이언트는 팩토리 클래스의 메서드를 호출하여 객체를 생성.
   - 예시 코드:
     ```java
     class SimpleFactory {
         public static Product createProduct(String type) {
             if ("A".equals(type)) {
                 return new ConcreteProductA();
             } else if ("B".equals(type)) {
                 return new ConcreteProductB();
             }
             return null;
         }
     }
     ```

2. **팩토리 메서드 패턴(Factory Method Pattern):**
   - 여러 개의 팩토리 클래스가 존재하며, 각각이 특정 제품을 생성하는 방식.
   - 추상 팩토리 클래스나 인터페이스를 통해 팩토리 메서드를 선언하고, 구체적인 서브 클래스에서 이를 구현.
   - 예시 코드:
     ```java
     interface Factory {
         Product createProduct();
     }
     
     // 구체적인 팩토리 클래스
     class ConcreteFactoryA implements Factory {
         @Override
         public Product createProduct() {
             return new ConcreteProductA();
         }
     }
     ```

3. **추상 팩토리 패턴(Abstract Factory Pattern):**
   - 여러 관련된 객체들의 팩토리를 생성하는 방식.
   - 각 팩토리는 관련된 객체들을 생성하는 책임을 진다.
   - 예시 코드:
     ```java
     interface AbstractFactory {
         ProductA createProductA();
         ProductB createProductB();
     }
     
     // 구체적인 팩토리 클래스
     class ConcreteFactory implements AbstractFactory {
         @Override
         public ProductA createProductA() {
             return new ConcreteProductA();
         }
     
         @Override
         public ProductB createProductB() {
             return new ConcreteProductB();
         }
     }
     ```