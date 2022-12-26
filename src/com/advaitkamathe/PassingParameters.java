package com.advaitkamathe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PassingParameters {

  public static void main(String[] args) {

    Employee john = new Employee("John Doe", 30);
    Employee jane = new Employee("Jane Doe", 28);
    Employee jack = new Employee("Jack Hill", 32);

    List<Employee> employees = new ArrayList<>();
    employees.add(john);
    employees.add(jane);
    employees.add(jack);

    // Without lambda expressions
//    Collections.sort(employees, new Comparator<Employee>() {
//      @Override
//      public int compare(Employee employee1, Employee employee2) {
//        return employee1.getName().compareTo(employee2.getName());
//      }
//    });

    // With lambda expressions
    // We don't need to include types in lambda expressions
    // When we have only one parameter, we don't need to use a parentheses
    // When a lambda body consists of a single statement that evaluates a value,
    // the return keyword is assumed, and the return value is inferred to be the type of the evaluated value
    // Once we add {} return statement is required

   Collections.sort(employees, (employee1, employee2 ) ->
        employee1.getName().compareTo(employee2.getName()));

   // for each method takes a lambda expression and evaluates for each item in the iterable collection
    employees.forEach(employee -> {
      System.out.print(employee.getName());
      System.out.println("\t" + employee.getAge());
    });
  }




}
