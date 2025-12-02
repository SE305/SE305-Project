//Test now incorrect for null/empty search
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
        assertNotNull(book);
        assertEquals("Java Programming", book.getTitle());
    }

    @Test
    void testSearchBookNotExists() {
        Book1 book = repository.searchBook("Nonexistent Book");
        assertNull(book);
    }

    @Test
    void testSearchBookCaseInsensitive() {
        assertEquals("Java Programming", repository.searchBook("JAVA PROGRAMMING").getTitle());
        assertEquals("Java Programming", repository.searchBook("java programming").getTitle());
        assertEquals("Java Programming", repository.searchBook("Java Programming").getTitle());
    }

    @Test
    void testSearchEmptyString() {
        assertNull(repository.searchBook(""));
    }

    @Test
    void testSearchNull() {
        assertNull(repository.searchBook(null));
    }

    @Test
    void testSearchWhiteSpace() {
        assertNull(repository.searchBook(""));
    }
}
