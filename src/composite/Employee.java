package composite;

// Component: 모든 구성요소의 공통 인터페이스
public abstract class Employee {
    String getName() {
        throw new UnsupportedOperationException();
    }

    double getSalary() {
        throw new UnsupportedOperationException();
    }

    /*
        자신의 역할에 맞지 않는 메소드는 오버라이드 하지 않고 기본 구현을 그대로 사용
     */
    public void addEmployee(Employee employee) {
        throw new UnsupportedOperationException();
    }

}
