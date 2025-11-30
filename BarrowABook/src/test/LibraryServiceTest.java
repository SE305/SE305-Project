//No major errors, but missing tests
package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryServiceTest {

    private LibraryService libraryService;

    @BeforeEach
    void setUp() {
        libraryService = new LibraryService();
    }

    @Test
    void testBorrowBookSuccess() {
        // Borrow should complete without exceptions
        assertDoesNotThrow(() -> libraryService.borrowBook(title));
    }

    @Test
    void testBorrowBookAlreadyBorrowed() {
        String title = "Data Structures";

        // First borrow should succeed
        assertDoesNotThrow(() -> libraryService.borrowBook(title));

        // Second borrow should handle gracefully (already borrowed message)
        assertDoesNotThrow(() -> libraryService.borrowBook(title));
    }

    @Test
    void testBorrowBookNotFound() {
        // Should handle gracefully without throwing exception
        assertDoesNotThrow(() -> libraryService.borrowBook("Nonexitstent Book Title"));
    }

    @Test
    void testBorrowEmptyTitle() {
        assertDoesNotThrow(() -> libraryService.borrowBook(""));
    }

    @Test
    void testBorrowNullTitle() {
        assertDoesNotThrow(() -> libraryService.borrowBook(null));
    }

    @Test
    void testLibraryServiceInitialization() {
        assertNotNull(libraryService);
    }
}
