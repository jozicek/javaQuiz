package jozinko.hadanky;

import jozinko.hadanky.dependencies.Bunnies;

/**
 * 1.) 9
 * 2.) 10
 * 3.) 11
 * 4.) 12
 * 5.) compilation failed
 * 6.) runtime error
 */
public class Hadanka_2017_02_01 {

  public static void main(String[] args) {
    new Bunnies();
    new Bunnies(Bunnies.count);
    System.out.println(Bunnies.count++);
  }

}
