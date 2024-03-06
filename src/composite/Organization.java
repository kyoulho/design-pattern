package composite;

// Client: 컴포지트 패턴을 활용하는 클라이언트 코드
public class Organization {
    public static void main(String[] args) {
        Employee worker1 = new Worker("John Doe", 50000);
        Employee worker2 = new Worker("Jane Smith", 60000);

        Employee development = new Department("Development");
        development.addEmployee(worker1);
        development.addEmployee(worker2);

        Employee worker3 = new Worker("Alice Johnson", 55000);
        Employee worker4 = new Worker("Bob Williams", 52000);

        Employee marketing = new Department("Marketing");
        marketing.addEmployee(worker3);
        marketing.addEmployee(worker4);

        Employee company = new Department("Company");
        company.addEmployee(development);
        company.addEmployee(marketing);

        // 각 부서와 직원의 연봉의 총합을 계산
        System.out.printf("Total Salary of %s: %f%n", development.getName(), development.getSalary());
        System.out.printf("Total Salary of %s: %f%n", marketing.getName(), marketing.getSalary());
        System.out.printf("Total Salary of %s: %f%n", company.getName(), company.getSalary());
    }
}
