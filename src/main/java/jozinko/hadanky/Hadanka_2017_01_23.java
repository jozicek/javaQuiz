package jozinko.hadanky;

/**
 * 1.) compilation failed
 * 2.) Java SE 6
 * 3.) Java SE 7
 * 4.) Java
 */
public class Hadanka_2017_01_23 {

  public static void main(String[] args) {
    String s = "Java";
    s.concat(" SE 6");
    s.replace('6', '7');
    System.out.print(s);
  }

}
