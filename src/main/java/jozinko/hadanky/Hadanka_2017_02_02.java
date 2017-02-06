package jozinko.hadanky;

/**
 * 1.) A=1, B=2
 * 2.) A=3, B=2
 * 3.) A=1, B=3
 * 4.) A=3, B=3
 * 5.) compilation failed
 * 6.) runtime error
 */
public class Hadanka_2017_02_02 {

  public static void main(String[] args) {
    Integer A = 1;
    int B = 2;
    change(A);
    change(B);

    System.out.println("A = " + A);
    System.out.println("B = " + B);
  }

  static void change(int i) {
    i = 3;
  }

  static void change(Integer i) {
    i = 3;
  }

}

