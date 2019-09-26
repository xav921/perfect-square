package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

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
    assertThrows(IllegalArgumentException.class, new Executable() {
      @Override
      public void execute() throws Throwable {
        Square.isPerfectSquare(-1);
      }
    });
  }

}