package com.linkedinlearning.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VATCalculatorTest {

  @Test
  public void testConstructorWithVatRate() {
    VATCalculator calculator = new VATCalculator(0.20);
    double netPrice = 100.00;
    String expectedInvoice = "Netto: 100.00 €\nVAT (0.20): 20.00 €\nTotal: 120.00 €";
    assertEquals(expectedInvoice, calculator.renderInvoice(netPrice));
  }

  @Test
  public void testCalculateGrossPrice() {
      VATCalculator calculator = new VATCalculator();
      double netPrice = 100.00;
      double expectedGrossPrice = 119.00;
      assertEquals(expectedGrossPrice, calculator.calculateGrossPrice(netPrice), 0.01);
  }

  @Test
  public void testRenderInvoice() {
    VATCalculator calculator = new VATCalculator();
    double netPrice = 100.00;
    String expectedInvoice = "Netto: 100.00 €\nVAT (0.19): 19.00 €\nTotal: 119.00 €";
    assertEquals(expectedInvoice, calculator.renderInvoice(netPrice));
  }

}
