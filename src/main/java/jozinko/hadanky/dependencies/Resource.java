package jozinko.hadanky.dependencies;

/**
 *
 */
public class Resource implements AutoCloseable{
  String id;
  public Resource(final String id){
    this.id = id;
  }
  public void close() {
    System.out.println("close: "+id);
  }
}
