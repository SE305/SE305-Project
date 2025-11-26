package library.testproject;

import static org.junit.jupiter.api.Assertions.*;

import library.data.InMemoryDataStore;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import library.ModelLayer.*;

public class InMemoryDataStoreTest {

    @Test
    public void testFindActiveLoan() {
        // Create a new in-memory data store.
        InMemoryDataStore store = new InMemoryDataStore();

        // Create Book and Member objects
        Book book = new Book("B1", "Clean Code", "Robert C. Martin", false);
        Member member = new Member("M1", "Ranya");

        // Add the book and member to the store
        store.books.put(book.getBookId(), book);
        store.members.put(member.getMemberId(), member);

        // Create a Loan object and add it to the store
        Loan loan = new Loan("L1", book, member, LocalDate.now(), LocalDate.now().plusDays(5));
        store.loans.put(loan.getLoanId(), loan);

        // Find the active loan by book ID and member ID
        Loan found = store.findActiveLoan("B1", "M1");
        assertNotNull(found);

        // Verify that the loan ID matches
        assertEquals("L1", found.getLoanId());

        // Mark the loan as returned
        loan.setReturned(true);

        // Verify that there is no active loan now
        assertNull(store.findActiveLoan("B1", "M1"));
    }
}
