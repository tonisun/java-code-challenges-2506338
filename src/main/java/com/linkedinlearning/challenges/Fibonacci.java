package com.linkedinlearning.challenges;

public class Fibonacci {
  public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int prev = 0;
        int current = 1;
        for (int i = 2; i <= n; i++) {
            int temp = current;
            current += prev;
            prev = temp;
        }
        return current;
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        int n = 12;
        int fib = fibonacci(n);
        System.out.println("Fibonacci number at position " + n + ": " + fib);

        int fibRecursive = fibonacciRecursive(n);
        System.out.println("Fibonacci number at position " + n + " (recursive): " + fibRecursive);
    }
}
