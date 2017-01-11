package jozinko.hadanky;

import jozinko.hadanky.dependencies.Foo;

/**
 * 1.) compilation failed
 * 2.) runtime error
 * 3.) 0
 * 4.) 5
 */
public class Hadanka_2017_01_12 {

  public static void main(String[] args) {
    Foo foo = new Foo();
    System.out.println(foo.count);
  }
}
