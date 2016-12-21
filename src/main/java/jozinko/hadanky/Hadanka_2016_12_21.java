package jozinko.hadanky;

import java.io.Serializable;

/**
 * 1.) 11
 * 2.) 22
 * 3.) 1231
 * 4.) 1232
 * 5.) compilation failed
 */
public enum Hadanka_2016_12_21 implements Serializable{

  A(1), B(2), C(3);

  public static void main(String[] args) {
    System.out.println(B.ordinal());
  }

  private Hadanka_2016_12_21(int i){
    System.out.print(i);
  }

}
