package test;

import java.util.ArrayList;
import java.util.List;

// ================== (Data Layer) ==================
// Holds the collection of books and provides search functionality
public class BookRepository {
    private List<Book1> books;

    // Load some default books in the library
    public BookRepository() {
        books = new ArrayList<>();
        books.add(new Book1("Java Programming"));
        books.add(new Book1("Data Structures"));
        books.add(new Book1("Database Systems"));
    }

    // Search for a book by title (case-insensitive)
    public Book1 searchBook(String title) {
        for (Book1 book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}
