package com.advaitkamathe;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFunctionDemo implements BiFunction<List<Integer>, List<Integer>, List<Integer>> {

  // Takes two arguments instead of one
  // Has two methods
  // 1) apply()
  // 2) andThen()

  @Override
  public List<Integer> apply(List<Integer> list1, List<Integer> list2) {
    return Stream.of(list1, list2)
        .flatMap(List::stream)
        .distinct()
        .collect(Collectors.toList());
  }

  public static void main(String[] args) {

    BiFunction biFunction1 = new BiFunctionDemo();
    List<Integer> list1 = Stream.of(1, 3, 5, 7, 8, 9).collect(Collectors.toList());
    List<Integer> list2 = Stream.of(2, 4, 5, 6, 8, 9).collect(Collectors.toList());
    System.out.println("Traditional approach: " + biFunction1.apply(list1, list2));

    BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction2 = new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {
      @Override
      public List<Integer> apply(List<Integer> list1, List<Integer> list2) {
        return Stream.of(list1, list2)
            .flatMap(List::stream)
            .distinct()
            .collect(Collectors.toList());
      }
    };
    System.out.println("Anonymous implementation: " + biFunction2.apply(list1, list2));

    BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction3 = (l1, l2) -> {
      return Stream.of(l1, l2)
          .flatMap(List::stream)
          .distinct()
          .collect(Collectors.toList());
    };
    System.out.println("Lambda function: " + biFunction3.apply(list1, list2));

    // Use cases
    Map<String, Integer> map = new HashMap<>();
    map.put("John", 10000);
    map.put("Jane", 8000);
    map.put("Jack", 12000);

    BiFunction<String, Integer, Integer> increaseSalary = (key, value) -> {
        return value + 1000;
    };
    map.replaceAll(increaseSalary);
    System.out.println(map);

    // andThen()
  }
}