package com.linkedinlearning.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PrimeNumberFinderTest {
  @Test
  public void testFindPrimes() {
    List<Integer> actual = PrimeNumberFinder.findPrimes(10, 50);
    List<Integer> expected = Arrays.asList(11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47);
    assertEquals(expected, actual);
  }

  @Test
  public void testFindPrimesRecursive() {
    List<Integer> actual = PrimeNumberFinder.findPrimesRecursive(10, 50);
    List<Integer> expected = Arrays.asList(11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47);
    assertEquals(expected, actual);
  }
}
