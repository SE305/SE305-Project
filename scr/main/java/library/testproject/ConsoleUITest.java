package library.testproject;

import static org.junit.jupiter.api.Assertions.*;

import library.presentation.ConsoleUI;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.time.LocalDate;
import library.data.InMemoryDataStore;
import library.ModelLayer.*;
import library.business.ReturnService;

public class ConsoleUITest {

    @Test
    public void testRunOnceBookReturn() {
        // Prepare the in-memory store.
        InMemoryDataStore store = new InMemoryDataStore();
        Book book = new Book("B1", "Clean Code", "Robert C. Martin", false);
        Member member = new Member("M1", "Ranya");
        store.books.put(book.getBookId(), book);
        store.members.put(member.getMemberId(), member);

        // Create a loan so the book can be returned
        Loan loan = new Loan("L1", book, member, LocalDate.now().minusDays(5), LocalDate.now().plusDays(5));
        store.loans.put(loan.getLoanId(), loan);

        // Prepare input as if the user typed it in the console
        String simulatedInput = "M1\nB1\n\n"; // Member ID, Book ID, empty date (today)
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(in); // redirect System.in to our simulated input

        // Create the ConsoleUI with ReturnService
        ReturnService service = new ReturnService(store);
        ConsoleUI ui = new ConsoleUI(service);

        // Run the method once (reads input and prints result)
        ui.runOnce();

        // After running, verify that the loan is returned
        assertTrue(loan.isReturned(), "Loan should be marked as returned");

        // Verify that the book is now available
        assertTrue(book.isAvailable(), "Book should be available");
    }
}
