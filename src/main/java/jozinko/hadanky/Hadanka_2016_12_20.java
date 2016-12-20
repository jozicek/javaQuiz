package jozinko.hadanky;

/**
 * 1.) i==42
 * 2.) i!=42
 * 3.) compilation failed
 * 4.) runtime error
 */
public class Hadanka_2016_12_20 {

  static Integer i;

  public static void main(String[] args) {
    if(i == 42){
      System.out.println("i==42");
    }else{
      System.out.println("i!=42");
    }
  }
}
