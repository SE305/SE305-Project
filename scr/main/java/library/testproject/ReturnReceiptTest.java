package library.testproject;

import static org.junit.jupiter.api.Assertions.*;

import library.ModelLayer.Book;
import library.ModelLayer.Loan;
import library.ModelLayer.Member;
import library.ModelLayer.ReturnReceipt;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class ReturnReceiptTest {

    @Test
    public void testReceiptCreation() {
        // Create Book and Member for the loan.
        Book book = new Book("B1", "Clean Code", "Robert C. Martin", false);
        Member member = new Member("M1", "Ranya");

        // Create a Loan object
        Loan loan = new Loan("L1", book, member, LocalDate.now(), LocalDate.now().plusDays(5));

        // Create a ReturnReceipt object with receipt ID, loan, and return date
        ReturnReceipt receipt = new ReturnReceipt("R1", loan, LocalDate.now());

        // Verify receipt ID is correct
        assertEquals("R1", receipt.getReceiptId());

        // Verify loan in receipt is correct
        assertEquals(loan, receipt.getLoan());

        // Verify return date is not null
        assertNotNull(receipt.getReturnDate());

        // Verify that the toString contains book title
        String text = receipt.toString();
        assertTrue(text.contains("Clean Code"));

        // Verify that the toString contains member name
        assertTrue(text.contains("Ranya"));
    }
}
