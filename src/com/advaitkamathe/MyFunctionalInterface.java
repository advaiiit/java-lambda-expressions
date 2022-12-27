package com.advaitkamathe;

@FunctionalInterface
public interface MyFunctionalInterface {

  void print();

  default void method1() {
    System.out.println("Default method-1");
  }

  default void method2() {
    System.out.println("Default method-2");
  }

  static void method3() {
    System.out.println("Static method-3");
  }
}
