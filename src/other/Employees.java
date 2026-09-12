package other;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employees {
    record Employee(String name, String department, double salary) {}

    static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Иван", "IT", 1200),
                new Employee("Мария", "HR", 900),
                new Employee("Пётр", "IT", 1500),
                new Employee("Анна", "Sales", 1000),
                new Employee("Ольга", "IT", 1100)
        );
        Map<String, Long> map = employees.stream().collect(Collectors.groupingBy(Employee::department, Collectors.counting()));
        employees.stream().filter(employee -> employee.salary()>1000).forEach(System.out::println);
        List<String> names = employees.stream().map(Employee::name).toList();
        long count = employees.stream().filter(employee -> employee.department().equals("IT")).count();
        double salary = employees.stream().map(Employee::salary).sorted(Comparator.reverseOrder()).distinct().skip(1L).findFirst().orElse(0.0);
    }



}
