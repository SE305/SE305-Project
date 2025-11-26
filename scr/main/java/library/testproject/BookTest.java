package library.testproject;

import static org.junit.jupiter.api.Assertions.*;

import library.ModelLayer.Book;
import org.junit.jupiter.api.Test;

public class BookTest {

    @Test
    public void testBookCreationAndAvailability() {
        // Create a new Book object with ID, title, author, and availability.
        Book book = new Book("B1", "Clean Code", "Robert C. Martin", false);

        // Check if the book ID is correctly assigned
        assertEquals("B1", book.getBookId());

        // Check if the title is correctly assigned
        assertEquals("Clean Code", book.getTitle());

        // Check if the author is correctly assigned
        assertEquals("Robert C. Martin", book.getAuthor());

        // Check that the book is initially not available
        assertFalse(book.isAvailable());

        // Change the availability to true
        book.setAvailable(true);

        // Verify that the availability has been updated
        assertTrue(book.isAvailable());
    }
}
