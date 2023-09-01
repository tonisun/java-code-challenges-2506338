package com.linkedinlearning.challenges;

public class Diamond {

  private char maxChar;

  public Diamond(char maxChar) {
    if (maxChar < 'A' || maxChar > 'Z')
      throw new IllegalArgumentException("Character must be between A and Z");
    this.maxChar = maxChar;
  }

  public String renderDiamond() {
    StringBuilder diamondBuilder = new StringBuilder();
    int maxCharValue = maxChar - 'A';

    for (int i = 0; i <= maxCharValue; i++) {
      appendWhiteSpace(diamondBuilder, maxCharValue - i);
      appendChar(diamondBuilder, (char) ('A' + i));
      appendWhiteSpace(diamondBuilder, 2 * i - 1);
      if (i != 0)
        appendChar(diamondBuilder, (char) ('A' + i));
      diamondBuilder.append('\n');
    }

    for (int i = maxCharValue - 1; i >= 0; i--) {
      appendWhiteSpace(diamondBuilder, maxCharValue - i);
      appendChar(diamondBuilder, (char) ('A' + i));
      appendWhiteSpace(diamondBuilder, 2 * i - 1);
      if (i != 0) 
        appendChar(diamondBuilder, (char) ('A' + i));
      diamondBuilder.append('\n');
    }

    return diamondBuilder.toString();
  }

  private void appendWhiteSpace(StringBuilder builder, int count) {
    for (int i = 0; i < count; i++)
      builder.append(' ');
  }

  private void appendChar(StringBuilder builder, char c) {
    if (c >= 'A' && c <= 'Z')
      builder.append(c);
  }

  public static void main(String[] args) {
    System.out.println(new Diamond('M').renderDiamond());
    System.out.println(new Diamond('D').renderDiamond());
  }
}
