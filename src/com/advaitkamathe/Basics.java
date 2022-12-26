package com.advaitkamathe;

public class Basics {

  public static void main(String[] args) {

    // Lambda expressions provide us an easier way to work with interfaces which have only one method
    // They are often used in places where we use anonymous classes
    // They are more convenient and concise way of writing anonymous classes

    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Printing from anonymous class method");
      }
    }).start();

    // Each lambda expression has got 3 parts:
    // 1) Argument List
    // 2) Arrow token
    // 3) Body

    new Thread(() -> System.out.println("Printing from lambda expression")).start();
  }
}