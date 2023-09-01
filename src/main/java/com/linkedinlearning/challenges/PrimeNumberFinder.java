package com.linkedinlearning.challenges;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberFinder {
  
  public static List<Integer> findPrimes(int start, int end) {
    List<Integer> primes = new ArrayList<>();
    for (int i = start; i <= end; i++) {
      if (isPrime(i)) {
        primes.add(i);
      }
    }
    return primes;
  }

  public static List<Integer> findPrimesRecursive(int start, int end) {
    List<Integer> primes = new ArrayList<>();
    for (int i = start; i <= end; i++) {
      if (isPrimeRecursive(i, i - 1)) {
        primes.add(i);
      }
    }
    return primes;
  }

  private static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  private static boolean isPrimeRecursive(int num, int div) {
    if (num <= 1) {
      return false;
    }
    if (div == 1) {
      return true;
    }
    if (num % div == 0) {
      return false;
    }
    return isPrimeRecursive(num, div - 1);
  }

  public static void main(String[] args) {
    int start = 10;
    int end = 50;
    List<Integer> primes = findPrimes(start, end);
    System.out.println("Prime numbers between " + start + " and " + end + ": " + primes);

    List<Integer> primesRecursive = findPrimesRecursive(start, end);
    System.out.println("Prime numbers between " + start + " and " + end + " (recursive): " + primesRecursive);
  }
  
}
