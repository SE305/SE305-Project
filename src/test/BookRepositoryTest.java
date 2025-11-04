package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookRepositoryTest {

    private BookRepository repository;

    @BeforeEach
    void setUp() {
        repository = new BookRepository();
    }

    @Test
    void testRepositoryInitialization() {
        // Repository should be initialized with 3 default books
        assertNotNull(repository.searchBook("Java Programming"));
        assertNotNull(repository.searchBook("Data Structures"));
        assertNotNull(repository.searchBook("Database Systems"));
    }

    @Test
    void testSearchBookExists() {
        Book1 book = repository.searchBook("java programming");
        assertNotNull(book, "Should find book with case-insensitive search");
        assertEquals("Java Programming", book.getTitle());
    }

    @Test
    void testSearchBookNotExists() {
        Book1 book = repository.searchBook("Nonexistent Book");
        assertNull(book, "Should return null for non-existent book");
    }

    @Test
    void testSearchBookCaseInsensitive() {
        Book1 book1 = repository.searchBook("JAVA PROGRAMMING");
        Book1 book2 = repository.searchBook("java programming");
        Book1 book3 = repository.searchBook("Java Programming");

        assertNotNull(book1);
        assertNotNull(book2);
        assertNotNull(book3);
        assertEquals("Java Programming", book1.getTitle());
    }

    @Test
    void testSearchEmptyString() {
        Book1 book = repository.searchBook("");
        assertNull(book, "Should return null for empty string");
    }

    @Test
    void testSearchNull() {
        Book1 book = repository.searchBook(null);
        assertNull(book, "Should return null for null input");
    }
}