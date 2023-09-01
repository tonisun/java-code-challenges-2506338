package com.linkedinlearning.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;

public class ArithmeticMeanTest {

  @Test
  public void testMean() {
    double actual = ArithmeticMean.mean(Arrays.asList(1, 2, 3, 4, 5));
    double expected = 3.0;
    assertEquals(expected, actual);
  }

  @Test
  public void testMeanEmptyCollection() {
    assertThrows(IllegalArgumentException.class, () -> ArithmeticMean.mean(Collections.emptyList()));
  }

  @Test
  public void testMeanNullCollection() {
    assertThrows(IllegalArgumentException.class, () -> ArithmeticMean.mean(null));
  }

  @Test
  public void testMean2() {
    double actual = ArithmeticMean.mean2(Arrays.asList(1, 2, 3, 4, 5));
    double expected = 3.0;
    assertEquals(expected, actual);
  }

  @Test
  public void testMean2EmptyCollection() {
    assertThrows(IllegalArgumentException.class, () -> ArithmeticMean.mean2(Collections.emptyList()));
  }

  @Test
  public void testMean2NullCollection() {
    assertThrows(IllegalArgumentException.class, () -> ArithmeticMean.mean2(null));
  }
}
