package jozinko.hadanky;


/**
 * Aky bude vystup ?
 *
 * 1.) String impl
 * 2.) Object impl
 * 3.) Compilation failed
 * 4.) Runtime error
 */
public class Hadanka_2016_11_30 {

  public static void method(String s){
    System.out.println("String impl");
  }

  public static void method(Object o){
    System.out.println("Object impl");
  }

  public static void main(String[] args) {
    method(null);
  }

}
