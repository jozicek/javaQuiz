package jozinko.hadanky.dependencies;


public class Bunnies {
  public static int count = 0;

  public Bunnies() {
    while (count < 10) new Bunnies(++count);
  }

  public Bunnies(int x) {
    x++;
  }

  public static void main(String[] args) {

  }
}