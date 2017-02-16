package jozinko.hadanky;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.) Hello World
 * 2.) Hello java.lang.Object@4554617c
 * 3.) Runtime error
 * 4.) Compilation failed on #1
 * 5.) Compilation failed on #2
 */
public class Hadanka_2017_02_16 {

  public static void main(String[] args) {
    List<String> ls = new ArrayList<>();
    ls.add("Hello ");
    List<Object> lo = ls; //#1
    lo.add("World"); //#2

    for (String s : ls) {
      System.out.println(s);
    }
  }


}
