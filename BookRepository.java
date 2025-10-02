import java.util.ArrayList;
import java.util.List;

// ================== (Data Layer) ==================
// Holds the collection of books and provides search functionality
public class BookRepository {
    private List<Book> books;

    // Load some default books in the library
    public BookRepository() {
        books = new ArrayList<>();
        books.add(new Book("Java Programming"));
        books.add(new Book("Data Structures"));
        books.add(new Book("Database Systems"));
    }

    // Search for a book by title (case-insensitive)
    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}
