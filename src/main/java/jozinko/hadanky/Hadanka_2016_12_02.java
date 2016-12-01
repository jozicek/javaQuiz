package jozinko.hadanky;

import jozinko.hadanky.dependencies.Resource;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Aky bude vystup :
 *
 * 1.) close : A, close : B
 * 2.) close : B, close : A
 * 3.) compilation failed
 * 4.) runtime error
 * 5.) no output
 */
public class Hadanka_2016_12_02 {

  public static void main(String[] args) throws FileNotFoundException{
    try(Resource r1 = new Resource("A"); Resource r2 = new Resource("B")){
    }
  }
}
