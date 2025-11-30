//Missing test for null/empty validation
package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Book1Test {

    private Book1 book;

    @BeforeEach
    void setUp() {
        book = new Book1("Test Book");
    }

    @Test
    void testBookCreation() {
        assertEquals("Test Book", book.getTitle());
        assertTrue(book.getStatus());
    }

    @Test
    void testMarkAsBorrowed() {
        // Mark as borrowed
        book.markAsBorrowed();

        // Mark as returned
        book.markAsRrturned();
        
        // Initially available
        assertTrue(book.getStatus());
    }

    @Test
    void testGetTitle() {
        Book1 specificBook = new Book1("Specific Title");
        assertEquals("Specific Title", specificBook.getTitle());
    }

    @Test
    void testMultipleBooks() {
        Book1 book1 = new Book1("Book One");
        Book1 book2 = new Book1("Book Two");

        assertEquals("Book One", book1.getTitle());
        assertEquals("Book Two", book2.getTitle());
        assertTrue(book1.getStatus());
        assertTrue(book2.getStatus());
    }

     @Test
    void testInvalidBookTitle() {
        assertThrows(IllegalArgumentException.class, () -> new Book1(""));
        assertThrows(IllegalArgumentException.class, () -> new Book1(null));
    }

}
