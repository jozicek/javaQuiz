package jozinko.hadanky;

/**
 * 1.) compilation ok
 * 2.) out:4
 * 3.) out:6
 * 4.) compilation failed on line 1
 * 5.) compilation failed on line 2
 */
public class Hadanka_2017_01_31 {

  private int x = 4;

  public static void main(String[] args) {
    //protected int x = 6; // #1
    new Hadanka_2017_01_31().new Inner().out(); // #2
  }

  class Inner {
    void out() {
      System.out.println("out:" + x);
    }
  }
}
