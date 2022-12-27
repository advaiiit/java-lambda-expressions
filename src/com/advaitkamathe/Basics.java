package com.advaitkamathe;

public class Basics {

  public static void main(String[] args) {

    // Lambda expressions provide us an easier way to work with methods of functional interfaces.
    // Functional Interfaces only contains one abstract method but can have multiple default and static methods
    // Ex.
    //    Runnable -> run()
    //    Callable -> call()
    //    Comparable -> compareTo()
    //    Comparator -> compare()

    // Lambda expressions are often used in places where we use anonymous methods
    // They are more convenient and concise way of writing anonymous methods

    // Anonymous method
    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Printing from anonymous class method");
      }
    }).start();

    // Each lambda expression has got 3 parts:
    // 1) Argument List ()
    // 2) Arrow token   ->
    // 3) Body          {}

    // Lambda Expression
    new Thread(() -> System.out.println("Printing from lambda expression")).start();
  }
}