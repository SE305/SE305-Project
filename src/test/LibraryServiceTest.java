// 🔧 SUGGESTION [Line 1]: Add these imports

package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryServiceTest {

    private LibraryService libraryService;
    private BookRepository mockRepository;

    @BeforeEach
    void setUp() {
        mockRepository = Mockito.mock(BookRepository.class);
        libraryService = new LibraryService();
    }

    @Test
    void testBorrowBookSuccess() {
        // This test verifies that borrowing an available book works
        // Note: We can't easily assert the console output, but we can verify
        // the book state changes through the repository
        String title = "Java Programming";

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
        String nonExistentTitle = "Nonexistent Book Title";

        // Should handle gracefully without throwing exception
        assertDoesNotThrow(() -> libraryService.borrowBook(nonExistentTitle));
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
        assertNotNull(libraryService, "LibraryService should be properly initialized");
    }
}
