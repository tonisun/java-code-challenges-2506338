package com.linkedinlearning.challenges;


public class VATCalculator {

  private double vatRate;
  private static final char CUR = '€';

  // Default constructor
  public VATCalculator() {
    this.vatRate = 0.19;  // Default VAT rate of 19%
  }

  // Constructor with VAT rate parameter
  public VATCalculator(double vatRate){
    this.vatRate = vatRate;
  }

  // Method to calculate gross price from net price
  public double calculateGrossPrice(double netPrice){
    return netPrice * (1 + vatRate);
  }

  // Method to render the invoice
  public String renderInvoice(double netPrice) {
    double vatAmount = netPrice * vatRate;
    double grossPrice = calculateGrossPrice(netPrice);

    return String.format("Netto: %,.2f %c\nVAT (%,.2f): %,.2f %c\nTotal: %,.2f %c", netPrice, CUR, vatRate, vatAmount, CUR, grossPrice, CUR);
  }

  public static void main(String[] args) {

    VATCalculator calculator1 = new VATCalculator();
    VATCalculator calculator2 = new VATCalculator(0.07);

    double netPrice = 100.00;
    
    System.out.println();
    System.out.println(calculator1.renderInvoice(netPrice));
    System.out.println();
    System.out.println(calculator2.renderInvoice(netPrice));
  }





}
