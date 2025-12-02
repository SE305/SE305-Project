//ID lookup not efficient

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public boolean addBook(Book book) {
        // Check duplicate ID
        for (Book b : books) {
            if (b.getId().equals(book.getId())) {
                return false;
            }
        }
        books.add(book);
        return true;
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty.");
        } else {
            System.out.println("Books in library:");
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }
}
