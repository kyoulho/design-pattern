# 어댑터 패턴

하나 이상의 클래스의 인터페이스를 변환한다.

---

어댑터 패턴은 특정 클래스 인터페이스를 클라이언트에서 요구하는 다른 인터페이스로 변환한다.

인터페이스가 호환되지 않아 같이 쓸 수 없었던 클래스를 사용할 수 있게 도와준다.

## 객체 어댑터와 클래스 어댑터

### 1. 클래스 어댑터(Class Adapter):

- **구조:**
  - 클래스 어댑터는 어댑터 클래스가 타깃(Target) 클래스를 상속하면서 어댑터 패턴을 구현한다.
  - 다중 상속을 지원하는 언어에서만 가능한 방식.

- **구현:**
  - 어댑터 클래스는 타깃 인터페이스를 구현하면서 어댑터 패턴의 메소드를 오버라이딩하여 타깃 클래스의 메소드를 호출한다.

- **코드 예제:**
  ```java
  // 클래스 어댑터의 예제
  interface Target {
      void request();
  }

  class Adaptee {
      void specificRequest() {
          System.out.println("Specific Request");
      }
  }

  class Adapter extends Adaptee implements Target {
      @Override
      public void request() {
          specificRequest();
      }
  }
  ```

### 2. 객체 어댑터(Object Adapter):

- **구조:**
  - 객체 어댑터는 어댑터 클래스가 타깃(Target) 인터페이스를 구현하면서 어댑터 패턴을 구현한다.
  - 구성(Composition)을 통해 어댑터 클래스가 어댑티(Adaptee) 객체를 포함한다.

- **구현:**
  - 어댑터 클래스는 어댑티 객체를 포함하고, 타깃 인터페이스를 구현하면서 내부적으로 어댑티 객체의 메소드를 호출한다.

- **코드 예제:**
  ```java
  // 객체 어댑터의 예제
  interface Target {
      void request();
  }

  class Adaptee {
      void specificRequest() {
          System.out.println("Specific Request");
      }
  }

  class Adapter implements Target {
      private Adaptee adaptee;

      public Adapter(Adaptee adaptee) {
          this.adaptee = adaptee;
      }

      @Override
      public void request() {
          adaptee.specificRequest();
      }
  }
  ```

### 어댑터 패턴 선택 기준:

- 클래스 어댑터는 상속을 사용하기 때문에, 어댑터 클래스가 여러 인터페이스를 동시에 구현할 수 있다. 하지만 자바와 같은 단일 상속 언어에서는 클래스 어댑터를 사용하기 어렵다.
- 객체 어댑터는 구성을 사용하므로, 어댑터 클래스가 여러 어댑티 객체를 포함할 수 있다. 이는 런타임에 동적으로 어댑티 객체를 변경할 수 있는 유연함을 갖게 된다.
- 일반적으로는 객체 어댑터를 더 선호하며, 특별한 경우에 클래스 어댑터를 사용한다.