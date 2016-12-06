package jozinko.hadanky.dependencies;


public class Rabbit extends Animal {

  public void playWith(Rabbit r) {
    System.out.println("jumping with " + r);
  }
  public String toString() {
    return "Rabbit";
  }
}
