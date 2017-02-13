package jozinko.hadanky;

import jozinko.hadanky.dependencies.Beagle;
import jozinko.hadanky.dependencies.Dog;

/**
 * 1.) Compilation failed
 * 2.) Runtime error
 * 3.) haf haf
 * 4.) haf
 * 5.) no output
 */
public class Hadanka_2017_02_13 {

  public static void main(String[] args) {
    Dog woofer = new Dog();
    Dog nipper = new Beagle();
    woofer.bark();
    nipper.bark();
  }

}
