package com.linkedinlearning.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DiamondTest {

  @Test
  public void testRenderDiamond() {
    Diamond diamondA = new Diamond('A');
    String expectedA = "A\n";
    assertEquals(expectedA, diamondA.renderDiamond());

    Diamond diamondD = new Diamond('D');
    String expectedD =
            "   A\n" +
            "  B B\n" +
            " C   C\n" +
            "D     D\n" +
            " C   C\n" +
            "  B B\n" +
            "   A\n";
    assertEquals(expectedD, diamondD.renderDiamond());
  }
}
