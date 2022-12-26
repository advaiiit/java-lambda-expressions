package com.advaitkamathe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class Functions {

  private static String getName(Function<Employee, String> getName, Employee employee) {
    return getName.apply(employee);
  }

  public static void main(String[] args) {

    Employee john = new Employee("John Doe", 30);
    Employee jane = new Employee("Jane Doe", 28);
    Employee jack = new Employee("Jack Hill", 32);

    List<Employee> employees = new ArrayList<>();
    employees.add(john);
    employees.add(jane);
    employees.add(jack);

    Function<Employee, String> getFirstName = (Employee employee) -> {
      return employee.getName().substring(0, employee.getName().indexOf(' '));
    };

    Function<Employee, String> getLastName = (Employee employee) -> {
      return employee.getName().substring(employee.getName().indexOf(' ') + 1);
    };

    Random random = new Random();
    for (Employee employee : employees) {
      if (random.nextBoolean()) {
        System.out.println(getName(getFirstName, employee));
      } else {
        System.out.println(getName(getLastName, employee));
      }
    }

    // Chaining functions
    Function<Employee, String> upperCase = employee -> employee.getName().toUpperCase();
    Function<String, String> firstName = name -> name.substring(0, name.indexOf(' '));
    Function chainedFunction = upperCase.andThen(firstName);

    for (Employee employee : employees) {
      System.out.println(chainedFunction.apply(employee));
    }
  }
}
