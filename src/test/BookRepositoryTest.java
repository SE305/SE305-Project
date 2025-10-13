package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

class BookRepositoryTest {

    BookRepository repo;

    @BeforeEach
    void setup() {
        repo = new BookRepository();
    }

    @Test
    void testSearchExistingBook() {
        List<Book> results = repo.search("Java Programming");
        assertNotNull(results);
        assertFalse(results.isEmpty());
        assertEquals("Java Programming", results.get(0).getTitle());
    }

    @Test
    void testSearchNonExistingBook() {
        List<Book> results = repo.search("Invisible Book");
        assertNotNull(results);
        assertTrue(results.isEmpty());
    }

    @Test
    void testBorrowBookSuccess() {
        repo = new BookRepository();
        List<Book> results = repo.search("Data Structures");
        assertNotNull(results);
        assertFalse(results.isEmpty());
        Book result = results.get(0);
        assertTrue(result.isAvailable());
        result.borrow();
        assertFalse(result.isAvailable());
    }

    @Test
    void testCatalogHasExpectedTitles() {
        List<Book> all = repo.search("");
        assertEquals(5, all.size());

        boolean hasJava = false, hasSE = false;
        for (Book b : all) {
            if (b.getTitle().equals("Java Programming")) hasJava = true;
            if (b.getTitle().equals("Software Engineering")) hasSE = true;
        }
        assertTrue(hasJava);
        assertTrue(hasSE);
    }
}
