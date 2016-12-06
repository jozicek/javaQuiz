package jozinko.hadanky;

import jozinko.hadanky.dependencies.Animal;
import jozinko.hadanky.dependencies.Rabbit;

/**
 * 1.) playing with Rabbit
 * 2.) playing with Animal
 * 3.) jumping with Rabbit
 * 4.) jumping with Animal
 */
public class Hadanka_2016_12_07 {

  public static void main(String[] args) {
    Animal animal = new Rabbit();
    animal.playWith(animal);
  }

}
