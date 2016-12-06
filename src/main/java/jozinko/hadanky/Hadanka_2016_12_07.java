package jozinko.hadanky;

import jozinko.hadanky.dependencies.Animal;
import jozinko.hadanky.dependencies.Rabbit;

/**
 * 1.)
 */
public class Hadanka_2016_12_07 {

  public static void main(String[] args) {
    Animal animal = new Rabbit();
    animal.playWith(animal);
  }

}
