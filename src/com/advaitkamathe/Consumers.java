package com.advaitkamathe;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class Consumers {

  // Consumer<T> is an in-built functional interface which can be used in all contexts where
  // an object needs to be consumed i.e. taken as input,
  // and some operation is to be performed on the object without returning any result

  public static void main(String[] args) {

    Consumer<Integer> consumer = (t) -> System.out.println("Printing: " + t);
    consumer.accept(10);

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    list.forEach(consumer);

    // forEach() method accepts consumer interface hence we can pass the lambda expression directly
    list.forEach(t -> System.out.print(t + "\t"));
  }
}
