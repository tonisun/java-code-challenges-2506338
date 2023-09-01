package com.linkedinlearning.challenges;

import java.util.Arrays;
import java.util.Collection;

public class ArithmeticMean {

  public static double mean(Collection<Integer> numbers) {
    if (numbers == null || numbers.isEmpty()) {
      throw new IllegalArgumentException("Collection cannot be null or empty");
    }
    int sum = 0;
    int count = 0;
    for (int number : numbers) {
      sum += number;
      count++;
    }
    return (double) sum / count;
  }

  public static double mean2(Collection<Integer> numbers) {
    if (numbers == null || numbers.isEmpty()) {
      throw new IllegalArgumentException("Collection cannot be null or empty");
    }
    return numbers.stream()
        .mapToInt(Integer::intValue)
        .average()
        .orElse(.0);
  }

  public static void main(String[] args) {
    double mean = ArithmeticMean.mean(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println("The arithmetic mean is: " + mean);

    double mean2 = ArithmeticMean.mean2(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println("The arithmetic mean is: " + mean2);
  }

}
