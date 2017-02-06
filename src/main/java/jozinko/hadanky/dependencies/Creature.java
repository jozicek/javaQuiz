package jozinko.hadanky.dependencies;

/**
 *
 */
public class Creature {
  private static long numCreated = 0;

  public Creature() {
    numCreated++;
  }

  public static long numCreated() {
    return numCreated;
  }
}

