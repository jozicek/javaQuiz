package jozinko.hadanky;


/**
 * Vystup bude :
 *
 * 1.) true, true, false
 * 2.) false, false, false
 * 3.) false, true, false
 * 4.) true, false, false
 * 5.) compilation failed on line 3
 * 6.) compilation failed on line 5
 * 7.) runtime error on line 4
 *
 */
public class Hadanka_2016_12_01 {

  public static void main(String[] args) {
    int[] a = {1,2,3,4};
    int i = 1;
    Object o = a;
    String s = "abcd";
    System.out.println(a instanceof Object); // #3
    System.out.println(null instanceof Object); // #4
    //System.out.println(s instanceof Integer); // #5
  }

}
