package library.ModelLayer;

import java.time.LocalDate;

/**
 * Represents a return receipt when a book is returned.
 * This is part of the MODEL layer.
 */
public class ReturnReceipt {

    private String receiptId;     // Unique ID for the receipt
    private Loan loan;            // The loan that is being returned
    private LocalDate returnDate; // The actual date of return

    // Constructor: create a new receipt
    public ReturnReceipt(String receiptId, Loan loan, LocalDate returnDate) {
        this.receiptId = receiptId;
        this.loan = loan;
        this.returnDate = returnDate;
    }

    // Getters
    public String getReceiptId() { return receiptId; }
    public Loan getLoan() { return loan; }
    public LocalDate getReturnDate() { return returnDate; }

    // Return readable information as text
    @Override
    public String toString() {
        return "Receipt ID: " + receiptId +
               "\nBook: " + loan.getBook().getTitle() +
               "\nReturned by: " + loan.getMember().getName() +
               "\nReturn Date: " + returnDate;
    }
}
