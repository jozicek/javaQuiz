package jozinko.hadanky;

/**
 * 1.) vystup | aky ?
 * 2.) compilation failed
 * 3.) runtime error
 */
public class Hadanka_2016_12_05 {

  boolean a;
  Boolean b = Boolean.FALSE;

  {
    System.out.println(a);
    System.out.println(b.equals(a));;
    System.out.println(b == a);
    System.out.println(b = true);
  }


  public static void main(String[] args) {
    new Hadanka_2016_12_05();
  }

}
