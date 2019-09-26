package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

  @Test
  void isPerfectSquare() {
    assertTrue(Square.isPerfectSquare(0));
    assertTrue(Square.isPerfectSquare(1));
    assertTrue(Square.isPerfectSquare(4));
    assertTrue(Square.isPerfectSquare(9));
    assertFalse(Square.isPerfectSquare(2));
    assertFalse(Square.isPerfectSquare(3));
    assertFalse(Square.isPerfectSquare(5));
  }

  @Test
  void isPerfectSquareException() {
    try {
      Square.isPerfectSquare(-1);
      fail();
    } catch (IllegalArgumentException expected) {
      // Do nothing; this is exactly as expected.
    }
  }

}