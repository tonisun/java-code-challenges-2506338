package com.linkedinlearning.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {


   @Test
    public void testRenderFizzBuzzUntil() {
        String expected = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz";
        String actual = FizzBuzz.renderFizzBuzzUntil(15);
        assertEquals(expected, actual);
    }
    
}
