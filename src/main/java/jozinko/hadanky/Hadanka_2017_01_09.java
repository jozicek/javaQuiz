package jozinko.hadanky;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.) ok
 * 2.) compilation failed on line 1
 * 3.) compilation failed on line 3
 * 4.) runtime error
 */
public class Hadanka_2017_01_09 {

  private static final Map map = new HashMap();

  public static void main(String[] args) {
    map.put("param1", "value1"); //line 1
    map.put("param2", "value2");
    //map = new HashMap(); // line 3
  }

}
