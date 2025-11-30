✅ Excellent unit test structure
✅ Good coverage of book lifecycle
✅ Clear test method names
🔧 Suggestion: Add tests for constructor with null/empty title
    
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
        assertTrue(book.getStatus(), "New book should be available by default");
    }

    @Test
    void testMarkAsBorrowed() {
        // Initially available
        assertTrue(book.getStatus());

        // Mark as borrowed
        book.markAsBorrowed();

        // Should not be available anymore
        assertFalse(book.getStatus());
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
}
