package library.ModelLayer;

import java.time.LocalDate;

/**
 * Represents a loan record (when a member borrows a book).
 * This is part of the MODEL layer.
 */
public class Loan {

    private String loanId;        // Unique loan ID
    private Book book;            // The borrowed book
    private Member member;        // The member who borrowed the book
    private LocalDate loanDate;   // Date when the book was borrowed
    private LocalDate dueDate;    // Expected return date
    private boolean returned;     // True if the book has been returned

    // Constructor: create a new loan record
    public Loan(String loanId, Book book, Member member, LocalDate loanDate, LocalDate dueDate) {
        this.loanId = loanId;
        this.book = book;
        this.member = member;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.returned = false; // when created, the book is not yet returned
    }

    // Getters
    public String getLoanId() { return loanId; }
    public Book getBook() { return book; }
    public Member getMember() { return member; }
    public LocalDate getLoanDate() { return loanDate; }
    public LocalDate getDueDate() { return dueDate; }
    public boolean isReturned() { return returned; }

    // Setter
    public void setReturned(boolean returned) { this.returned = returned; }

    // toString method: readable info about the loan
    @Override
    public String toString() {
        return member.getName() + " borrowed \"" + book.getTitle() +
               "\" on " + loanDate + " (Due: " + dueDate + ")" +
               (returned ? " [Returned]" : " [Not Returned]");
    }
}
