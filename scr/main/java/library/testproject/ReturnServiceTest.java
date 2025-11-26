package library.testproject;

import static org.junit.jupiter.api.Assertions.*;

import library.business.ReturnService;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import library.data.InMemoryDataStore;
import library.ModelLayer.*;

public class ReturnServiceTest {

    @Test
    public void testReturnBookSuccess() {
        // Create a new data store and the ReturnService.
        InMemoryDataStore store = new InMemoryDataStore();
        ReturnService service = new ReturnService(store);

        // Create Book and Member objects
        Book book = new Book("B1", "Clean Code", "Robert C. Martin", false);
        Member member = new Member("M1", "Ranya");

        // Add book and member to the store
        store.books.put(book.getBookId(), book);
        store.members.put(member.getMemberId(), member);

        // Create a Loan and add it to the store
        Loan loan = new Loan("L1", book, member, LocalDate.now().minusDays(5), LocalDate.now().plusDays(5));
        store.loans.put(loan.getLoanId(), loan);

        // Process the return
        String result = service.processReturn("M1", "B1", LocalDate.now());

        // Verify the loan is marked as returned
        assertTrue(loan.isReturned());

        // Verify the book is now available
        assertTrue(book.isAvailable());

        // Verify the receipt contains the book title
        assertTrue(result.contains("Clean Code"));

        // Verify the receipt contains the member name
        assertTrue(result.contains("Ranya"));
    }

    @Test
    public void testMemberNotFound() {
        // Create a new store and service
        InMemoryDataStore store = new InMemoryDataStore();
        ReturnService service = new ReturnService(store);

        // Try to return a book with non-existent member
        String result = service.processReturn("Unknown", "B1", LocalDate.now());

        // Verify error message
        assertEquals("ERROR: Member not found (Unknown)", result);
    }

    @Test
    public void testBookNotFound() {
        // Create store and service
        InMemoryDataStore store = new InMemoryDataStore();
        ReturnService service = new ReturnService(store);

        // Add a member
        Member member = new Member("M1", "Ranya");
        store.members.put(member.getMemberId(), member);

        // Try to return non-existent book
        String result = service.processReturn("M1", "B999", LocalDate.now());

        // Verify error message
        assertEquals("ERROR: Book not found (B999)", result);
    }

    @Test
    public void testNoActiveLoan() {
        // Create store and service
        InMemoryDataStore store = new InMemoryDataStore();
        ReturnService service = new ReturnService(store);

        // Add book and member
        Book book = new Book("B1", "Clean Code", "Robert C. Martin", false);
        Member member = new Member("M1", "Ranya");
        store.books.put(book.getBookId(), book);
        store.members.put(member.getMemberId(), member);

        // No loan added, should return error
        String result = service.processReturn("M1", "B1", LocalDate.now());

        // Verify error message
        assertEquals("ERROR: No active loan for this book and member.", result);
    }
}
