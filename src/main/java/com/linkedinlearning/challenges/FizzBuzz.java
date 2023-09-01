package com.linkedinlearning.challenges;

public class FizzBuzz {

  private static final String NEW_LINE = System.getProperty("line.separator");

  private static String applyFizzBuzz(int i) {
    if (i % 3 == 0) {
      return i % 5 == 0 ? "FizzBuzz" : "Fizz";
    } else if (i % 5 == 0) {
      return "Buzz";
    } else {
      return String.valueOf(i);
    }
  }

  public static String renderFizzBuzzUntil(int end) {

    var outputBuilder = new StringBuilder();
    for (int i = 1; i <= end; i++) {
      outputBuilder.append(applyFizzBuzz(i))
          .append(NEW_LINE);
    }

    // remove last new line
    outputBuilder.deleteCharAt(outputBuilder.length() - 1);

    return outputBuilder.toString();
  }

  public static void main(String[] args) {
    int end = 30;
    String result = renderFizzBuzzUntil(end);
    System.out.println(result);
  }
  
}
