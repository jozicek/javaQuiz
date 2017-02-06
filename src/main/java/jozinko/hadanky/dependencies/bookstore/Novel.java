package jozinko.hadanky.dependencies.bookstore;

import jozinko.hadanky.dependencies.library.Book;

/**
 * 1.) OK
 * 2.) Compilation failed, where?
 */
class Novel extends Book {
  String getAuthor1() {
    return author;
  }
  String getAuthor2() {
    //return new Book().author;
    return null; // should be removed and use line abowe instead.
  }
}
