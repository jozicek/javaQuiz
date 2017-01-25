package jozinko.hadanky;

/**
 * 1.) ABCD
 * 2.) Compilation fails.
 * 3.) C
 * 4.) BC
 * 5.) CD
 * 6.) BCD
 */
public class Hadanka_2017_01_25 {

  public static void main(String[] args) {
    try {
      badMethod();
      System.out.print("A");
    } catch (Exception ex) {
      System.out.print("B");
    } finally {
      System.out.print("C");
    }
    System.out.print("D");
  }

  public static void badMethod() {
    throw new Error();
  }

}
