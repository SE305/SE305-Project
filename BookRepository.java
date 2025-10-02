
import java.util.ArrayList;
import java.util.List;

// ================== (Data Layer) ==================
//  stores books in a list and provides a method to find books by title.

public class BookRepository {
    private List<Book> books;
    // Constructor to create initial list of books in the library
    public BookRepository() {
        books = new ArrayList<>();
        books.add(new Book("Java Programming"));
        books.add(new Book("Data Structures"));
        books.add(new Book("Database Systems"));
    }
    // find a book by title (case-insensitive search)
    public Book findBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null; // If no book is found
    }
}
