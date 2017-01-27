package jozinko.hadanky;

/**
 * 1.) compilation failed
 * 2.) runtime error
 * 3.) x = ?
 */
public class Hadanka_2017_01_27 {

  public static void main(String[] args) {
    int x = 2;
    x += x++ * --x * x++;
    System.out.println("x = " + x);
  }

}
