package jozinko.hadanky;

/**
 * 1.) 2 4
 * 2.) 0 2 4
 * 3.) 2 4 6
 * 4.) 0 2 4 6
 * 5.) compilation fails
 * 6.) some other result
 */
public class Hadanka_2017_01_30 {

  static int bump(int x) {
    return x + 2;
  }

  public static void main(String[] args) {
    for (int x = 0; x < 5; bump(x))
      System.out.print(x + " ");
  }

}
