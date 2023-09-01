package com.linkedinlearning.challenges;

public class StringCalculator {
  
  public static int add(String numbers) {
    if (numbers == null || numbers.isEmpty()) {
      return 0;
    }
    String[] numArray = numbers.split(",");
    int sum = 0;
    for (String num : numArray) {
      sum += Integer.parseInt(num.trim());
    }
    return sum;
  }

  public static void main(String[] args) {
    String numbers = "1,2,3,4,5";
    int sum = add(numbers);
    System.out.println("Sum of numbers in the string: " + sum);
  }
}
