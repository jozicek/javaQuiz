package jozinko.hadanky;

import jozinko.hadanky.dependencies.Foo;

/**
 * Which lines and when do throw NoClassDefFoundError?
 * Which lines and when do throw ClassNotFoundException?
 *
 * hint : code compiles and its about class paths.
 */
public class Hadanka_2017_01_19 {

  Foo foo = new Foo(10); // 1

  public void consumer(Foo foo) {} // 2

  public static void main(String[] args) throws ClassNotFoundException {
    Class clazz = Class.forName("Foo"); //3
    clazz.getClassLoader().loadClass("Foo"); // 4
  }

}
