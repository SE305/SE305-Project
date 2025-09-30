import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<Book> books;

    public BookRepository() {
        books = new ArrayList<>();
        books.add(new Book("Java Programming"));
        books.add(new Book("Data Structures"));
        books.add(new Book("Database Systems"));
    }

    public Book findBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }
}
