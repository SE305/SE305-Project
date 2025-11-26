package library.testproject;

import static org.junit.jupiter.api.Assertions.*;

import library.ModelLayer.Book;
import library.ModelLayer.Loan;
import library.ModelLayer.Member;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class LoanTest {

    @Test
    public void testLoanCreationAndReturn() {
        // Create a Book and Member to associate with the loan.
        Book book = new Book("B1", "Clean Code", "Robert C. Martin", false);
        Member member = new Member("M1", "Ranya");

        // Create a new Loan object with loan ID, book, member, loan date, due date
        Loan loan = new Loan("L1", book, member, LocalDate.now(), LocalDate.now().plusDays(5));

        // Verify that loan ID is correct
        assertEquals("L1", loan.getLoanId());

        // Verify that the loan's book is correct
        assertEquals(book, loan.getBook());

        // Verify that the loan's member is correct
        assertEquals(member, loan.getMember());

        // Verify that the loan is initially not returned
        assertFalse(loan.isReturned());

        // Mark the loan as returned
        loan.setReturned(true);

        // Verify that the loan is now returned
        assertTrue(loan.isReturned());
    }
}
