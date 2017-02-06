package jozinko.hadanky;

import jozinko.hadanky.dependencies.Fest;
import jozinko.hadanky.dependencies.Test;

/**
 * 1.) compilation failed
 * 2.) runtime error
 * 3.) test
 * 4.) fest
 */
public class Hadanka_2017_01_20 {

  public static void main(String[] args) {
    Test test = new Fest();
    test.test();
  }
}
