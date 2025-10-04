
package library.data;

import java.util.*;
import library.ModelLayer.*;

/**
 * Very simple in-memory data storage.
 * It keeps books, members, and loans in memory using HashMaps.
 */
public class InMemoryDataStore {

    // HashMaps work like mini-databases in memory
    public final Map<String, Book> books = new HashMap<>();
    public final Map<String, Member> members = new HashMap<>();
    public final Map<String, Loan> loans = new HashMap<>();

    /**
     * Find an active (not yet returned) loan
     * by book ID and member ID.
     * @return the loan if found, or null if none found.
     */
    public Loan findActiveLoan(String bookId, String memberId) {
        for (Loan l : loans.values()) {
            if (!l.isReturned() &&
                l.getBook().getBookId().equals(bookId) &&
                l.getMember().getMemberId().equals(memberId)) {
                return l;
            }
        }
        return null;
    }
}
