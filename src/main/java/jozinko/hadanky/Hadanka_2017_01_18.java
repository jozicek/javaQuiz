package jozinko.hadanky;

/**
 * 1.) 0
 * 2.) 0 2
 * 3.) runtime error
 * 4.) compilation failed
 * 5.) 0 1 3
 */
public class Hadanka_2017_01_18 {

  public static void main(String[] args) {

    int j = 2;

    for (int i = 0; i < 10 % j + 1; i += 2) {
      System.out.print(i + " ");
    }
    //System.out.println(i);
  }

}
