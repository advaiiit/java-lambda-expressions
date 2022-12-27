package com.advaitkamathe;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {

  // Predicate functional interface is used for conditional check

  private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition) {

    System.out.println(ageText);
    for (Employee employee : employees) {
      if (ageCondition.test(employee)) {
        System.out.println(employee.getName());
      }
    }
    System.out.println();
  }
  public static void main(String[] args) {

    Employee john = new Employee("John Doe", 30);
    Employee jane = new Employee("Jane Doe", 28);
    Employee jack = new Employee("Jack Hill", 32);

    List<Employee> employees = new ArrayList<>();
    employees.add(john);
    employees.add(jane);
    employees.add(jack);

    printEmployeesByAge(employees, "Employees over 30", employee -> employee.getAge() > 30);
    printEmployeesByAge(employees, "Employees below 30", employee -> employee.getAge() < 30);

    Predicate<Integer> predicate = (t) -> {
      if (t % 2 == 0) {
        return true;
      } else {
        return false;
      }
    };

    System.out.println(predicate.test(8));

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    list.stream().filter(predicate).forEach(t -> System.out.println(t + "\t"));
  }
}
