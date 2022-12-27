package com.advaitkamathe;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Suppliers {

  // Supplier Functional Interface can be used in all context where there is no input but an output is expected

  public static void main(String[] args) {

    Supplier<String> supplier = () -> "Hello from supplier";
    System.out.println(supplier.get());

    List<String> list = Arrays.asList();
    System.out.println(list.stream().findAny().orElseGet(() -> "Did not found any"));
  }
}
