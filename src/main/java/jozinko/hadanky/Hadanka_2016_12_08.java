package jozinko.hadanky;

/**
 * 1.) i = 0
 * 2.) i = 5
 * 3.) compilation failed.
 * 4.) NullPointerException
 */
public class Hadanka_2016_12_08 {

  static int i=5;

  public static void main(String[] args) {
    Hadanka_2016_12_08 hadanka = null;
    System.out.println("i = "+hadanka.i);
  }

}
