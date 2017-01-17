package jozinko.hadanky;

/**
 * 1.) ex
 * 2.) aex
 * 3.) finished
 * 4.) compilation failed
 * 5.) runtime error
 */
public class Hadanka_2016_01_17 {

  public static void main(String[] args) {
    try {
      int x = 0;
      int y = 5 / x;
    } catch (Exception e) {
      System.out.println("ex");
    } catch (ArithmeticException ae) {
      System.out.println("aex");
    }
    System.out.println("finished");
  }

}
