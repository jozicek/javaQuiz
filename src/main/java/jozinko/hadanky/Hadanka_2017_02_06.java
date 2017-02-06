package jozinko.hadanky;

/**
 * 1.) 12
 * 2.) 12b
 * 3.) NullPointerException
 * 4.) NumberFormatException
 * 5.) IllegalArgumentException
 * 6.) ArrayIndexOutOfBoundsException
 * 7.) Compilation failed
 */
public class Hadanka_2017_02_06 {

  String a = "12b";

  public static void main(String[] args) {
    System.out.println(new Hadanka_2017_02_06().chop(args[0]));
  }

  int chop(String a) {
    if (a == null) throw new IllegalArgumentException();
    return Integer.parseInt(a);
  }

}
