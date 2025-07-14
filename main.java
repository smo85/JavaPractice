import java.util.ArrayList;
import java.util.List;

public class main {
  public static void main(String[] args) {
    Book b1 = new Book("Effective Java", "Mr. Java");
    Book b2 = new Book("Less-Effective Java", "Mr. Python");
    Book b3 = new Book("Fun Stuff", "Miss FunStuff");

    List<Book> book = new ArrayList<Book>();
    book.add(b1);
    book.add(b2);
    book.add(b3);

    Library library = new Library(book);

    List<Book> books = library.getBooksInLibrary();

    for(Book b : books) {
      System.out.println("Title: " + b.title
      + "\nAuthor: " + b.author);
    }
  }
}
