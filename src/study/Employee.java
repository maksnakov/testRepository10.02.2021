package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary() {
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<Employee> moreSalary = Arrays.asList(
                new Employee("Jack", 34, 230),
                new Employee("Tom", 23, 140),
                new Employee("Vova", 45, 300),
                new Employee("Andrey", 19, 180),
                new Employee("Maks", 27, 205));
        moreSalary.stream().filter(s -> s.getSalary() > 200).forEach(s -> System.out.println(s.getName()));
        System.out.println("---------");
        moreSalary.stream().sorted(Comparator.comparing(s -> s.getName().toString())).collect(Collectors.toList())
                .forEach(s -> System.out.println(s.getName()));
        System.out.println("---------");
        moreSalary.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList())
                .forEach(s -> System.out.println(s.getName()));
        System.out.println("---------");

    }
}
