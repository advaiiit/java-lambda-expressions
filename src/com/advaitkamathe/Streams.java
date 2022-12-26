package com.advaitkamathe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

  public static void main(String[] args) {

    List<String> someBingoNumbers = Arrays.asList(
        "N40", "N36",
        "B12", "B6",
        "G53", "G49", "G60", "g50", "g64",
        "I26", "I17", "I29",
        "O71");

    List<String> gNumbers = new ArrayList<>();

//    someBingoNumbers.forEach(number -> {
//      if (number.toUpperCase().startsWith("G")) {
//        gNumbers.add(number);
//      }
//    });
//
//    gNumbers.sort((s1, s2) -> s1.compareTo(s2));
//    gNumbers.forEach((s) -> System.out.println(s));

    // These four operations can be done in a single line using streams
    // Creating stream from a collection
    someBingoNumbers                    // Stream source
        .stream()
        .map(String::toUpperCase)
        .filter(s -> s.startsWith("G"))
        .sorted()                       // Intermediate Operation
        .forEach(System.out::println);  // Terminal Operation

    // Creating stream from scratch
    Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "O71");
    Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "O71");
    Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);
    System.out.println(concatStream
        .distinct()
        .peek(System.out::println)
        .count());
  }:
}
