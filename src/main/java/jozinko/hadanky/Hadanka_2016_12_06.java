package jozinko.hadanky;

import jozinko.hadanky.dependencies.ID;
import jozinko.hadanky.dependencies.Person;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 * 1.) compilation failed
 * 2.) runtime error
 * 3.) nieco ako Person@2g5ee8
 * 4.) null
 * 5.) Peter
 * 6.) Karol
 */
public class Hadanka_2016_12_06 {

  public static void main(String[] args) throws ParseException {
    Map<ID, Person> register = new HashMap<>();
    register.put(new ID(1), new Person("Fero"));
    System.out.println(register.get(new ID(1)));
  }



}
