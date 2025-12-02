//Cannot fully test due to Scanner and loop
package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryAppTest {
    @Test
    void testLibraryAppInstantiation() {
        assertDoesNotThrow(() -> new LibraryApp());
    }

    @Test
    void testLibraryServiceIntegration() {
        LibraryService service = new LibraryService();
        assertDoesNotThrow(() -> service.borrowBook("Java Programming"));
        assertDoesNotThrow(() -> service.borrowBook("Nonexistent Book"));
    }
}
