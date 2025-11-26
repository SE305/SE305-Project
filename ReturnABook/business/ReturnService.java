
package library.business;
import java.time.LocalDate;
import java.util.UUID;
import library.ModelLayer.*;
import library.data.InMemoryDataStore;

/**
 * Business layer class that handles the logic for returning a book.
 */
public class ReturnService {

    private final InMemoryDataStore store;  // connect to data layer

    // Constructor: receives the data store
    public ReturnService(InMemoryDataStore store) {
        this.store = store;
    }

    /**
     * Process the return of a book.
     * @param memberId the ID of the member returning the book
     * @param bookId the ID of the book being returned
     * @param date the actual return date
     * @return a simple message or receipt text
     */
    public String processReturn(String memberId, String bookId, LocalDate date) {
        // 1. Validate the member
        if (!store.members.containsKey(memberId)) {
            return "ERROR: Member not found (" + memberId + ")";
        }

        // 2. Validate the book
        if (!store.books.containsKey(bookId)) {
            return "ERROR: Book not found (" + bookId + ")";
        }

        // 3. Find an active (not returned) loan for this member and book
        Loan loan = store.findActiveLoan(bookId, memberId);
        if (loan == null) {
            return "ERROR: No active loan for this book and member.";
        }

        // 4. Mark loan as returned and update book availability
        loan.setReturned(true);
        store.books.get(bookId).setAvailable(true);

        // 5. Create a simple return receipt
        ReturnReceipt receipt = new ReturnReceipt(
                UUID.randomUUID().toString(),  // generate unique ID
                loan,
                date
        );

        // 6. Return a readable summary
        return receipt.toString();
    }
}
















// Review test comment
