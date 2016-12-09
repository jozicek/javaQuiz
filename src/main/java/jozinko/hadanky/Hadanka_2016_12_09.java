package jozinko.hadanky;

/**
 * 1.) StackOverflowError
 * 2.) NullPointerException
 * 3.) null
 * 4.) 1
 */
public class Hadanka_2016_12_09 {

  Hadanka_2016_12_09 h = new Hadanka_2016_12_09();

  int getValue() {
    return (true ? null : 1);
  }

  public static void main(String[] args) {
    Hadanka_2016_12_09 h = new Hadanka_2016_12_09();
    System.out.println(h.getValue());
  }
}
