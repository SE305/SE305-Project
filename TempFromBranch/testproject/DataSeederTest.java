package library.testproject;

import library.ModelLayer.Loan;
import library.data.DataSeeder;
import library.data.InMemoryDataStore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for DataSeeder
 * Ensures that the seed method correctly adds demo data to the store.
 */
public class DataSeederTest {

    @Test
    public void testSeedAddsData() {
        // 1. Create an empty in-memory data store
        InMemoryDataStore store = new InMemoryDataStore();

        // 2. Call the seed method to add demo data
        DataSeeder.seed(store);

        // 3. Check that books are added correctly
        assertTrue(store.books.containsKey("B1"), "Book B1 should exist in the store");
        assertTrue(store.books.containsKey("B2"), "Book B2 should exist in the store");

        // 4. Check that member is added correctly
        assertTrue(store.members.containsKey("M1"), "Member M1 should exist in the store");

        // 5. Check that the loan is added correctly
        assertTrue(store.loans.containsKey("L1"), "Loan L1 should exist in the store");

        // 6. Verify loan links the correct book and member
        Loan loan = store.loans.get("L1");
        assertEquals("B1", loan.getBook().getBookId(), "Loan should reference book B1");
        assertEquals("M1", loan.getMember().getMemberId(), "Loan should reference member M1");
    }
}
