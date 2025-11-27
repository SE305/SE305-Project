package library.data;

import java.time.LocalDate;
import library.ModelLayer.*;

/**
 * Adds a few demo records to the data store
 * so the program can run and test immediately.
 */
public class DataSeeder {

    public static void seed(InMemoryDataStore store) {
        // Create books
        Book b1 = new Book("B1", "Clean Code", "Robert C. Martin", false); // currently on loan
        Book b2 = new Book("B2", "Effective Java", "Joshua Bloch", true);

        // Create member
        Member m1 = new Member("M1", "Ranya");

        // Store them in the data store
        store.books.put(b1.getBookId(), b1);
        store.books.put(b2.getBookId(), b2);
        store.members.put(m1.getMemberId(), m1);

        // Create a loan so we can test the return feature
        Loan l1 = new Loan("L1", b1, m1,
                LocalDate.now().minusDays(5), // borrowed 5 days ago
                LocalDate.now().plusDays(5)); // due in 5 days

        store.loans.put(l1.getLoanId(), l1);
    }
}
