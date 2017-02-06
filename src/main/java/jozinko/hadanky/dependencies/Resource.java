package jozinko.hadanky.dependencies;

/**
 *
 */
public class Resource implements AutoCloseable{
  String id;
  public Resource(final String id){
    if(id.equals("B")) throw new NullPointerException();
    this.id = id;
  }
  public void close() {
    System.out.println("close: "+id);
  }
}
