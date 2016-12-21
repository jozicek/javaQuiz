package jozinko.hadanky;

import java.io.Serializable;

/**
 * 1.) 22
 * 2.) 21
 * 3.) 1232
 * 4.) 1231
 * 5.) compilation failed
 */
public enum Hadanka_2016_12_21 implements Serializable {

  A(1), B(2), C(3);

  public static void main(String[] args) {
    System.out.println(B.ordinal());
  }

  private Hadanka_2016_12_21(int i) {
    System.out.print(i);
  }

}
