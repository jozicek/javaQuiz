package jozinko.hadanky;

/**
 * 1.) 1
 * 2.) 2
 * 3.) Runtime error
 * 4.) compilation failed
 */
public class Hadanka_2017_01_10 {

  public static void main(String[] args) {
    int x, y = 1;
    x = 10;

    if (x != 10 && x / 0 == 0)
      System.out.println(y);
    else
      System.out.println(y++);
  }

}
