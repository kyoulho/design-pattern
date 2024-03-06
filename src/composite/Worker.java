package composite;

// Leaf: 개별 직원을 나타내는 클래스
class Worker extends Employee {
    private final String name;
    private final double salary;

    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
