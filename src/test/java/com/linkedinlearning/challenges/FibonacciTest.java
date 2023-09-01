package com.linkedinlearning.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FibonacciTest {
  @Test
  public void testFibonacci() {
    assertEquals(0, Fibonacci.fibonacci(0));
    assertEquals(1, Fibonacci.fibonacci(1));
    assertEquals(1, Fibonacci.fibonacci(2));
    assertEquals(2, Fibonacci.fibonacci(3));
    assertEquals(3, Fibonacci.fibonacci(4));
    assertEquals(5, Fibonacci.fibonacci(5));
    assertEquals(8, Fibonacci.fibonacci(6));
    assertEquals(13, Fibonacci.fibonacci(7));
    assertEquals(21, Fibonacci.fibonacci(8));
    assertEquals(34, Fibonacci.fibonacci(9));
    assertEquals(55, Fibonacci.fibonacci(10));
    assertEquals(89, Fibonacci.fibonacci(11));
    assertEquals(144, Fibonacci.fibonacci(12));
  }

  @Test
  public void testFibonacciRecursive() {
    assertEquals(0, Fibonacci.fibonacciRecursive(0));
    assertEquals(1, Fibonacci.fibonacciRecursive(1));
    assertEquals(1, Fibonacci.fibonacciRecursive(2));
    assertEquals(2, Fibonacci.fibonacciRecursive(3));
    assertEquals(3, Fibonacci.fibonacciRecursive(4));
    assertEquals(5, Fibonacci.fibonacciRecursive(5));
    assertEquals(8, Fibonacci.fibonacciRecursive(6));
    assertEquals(13, Fibonacci.fibonacciRecursive(7));
    assertEquals(21, Fibonacci.fibonacciRecursive(8));
    assertEquals(34, Fibonacci.fibonacciRecursive(9));
    assertEquals(55, Fibonacci.fibonacciRecursive(10));
    assertEquals(89, Fibonacci.fibonacciRecursive(11));
    assertEquals(144, Fibonacci.fibonacciRecursive(12));
  }

}
