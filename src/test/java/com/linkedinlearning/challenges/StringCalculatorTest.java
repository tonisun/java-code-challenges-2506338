package com.linkedinlearning.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

  @Test
  public void testAdd() {
    assertEquals(0, StringCalculator.add(""));
    assertEquals(1, StringCalculator.add("1"));
    assertEquals(3, StringCalculator.add("1,2"));
    assertEquals(10, StringCalculator.add("1,2,3,4"));
    assertEquals(15, StringCalculator.add("1,2,3,4,5"));
  }
  
}
