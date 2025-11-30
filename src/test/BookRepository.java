✅ Good data layer separation
✅ Case-insensitive search works well
🚨 Performance Issue: O(n) linear search with ArrayList
🔧 Suggestion: Use HashMap<String, Book> for O(1) lookup performance
🔧 Suggestion: Add methods for adding/removing books dynamically
    
package test;

import java.util.ArrayList;
import java.util.List;

// ================== (Data Layer) ==================
// Holds the collection of books and provides search functionality
public class BookRepository {
    private List<Book1> books;

    // Load some default books in the library
    public BookRepository() {
        private Map<String, Book1> bookMap;
        public BookRepository() {
            bookMap = new HashMap<>();
            bookMap.put("java programming", new Book1("Java Programming"));
            bookMap.put("data structures", new Book1("Data Structures"));
            bookMap.put("database systems", new Book1("Database Systems"));
    }

    // Search for a book by title (case-insensitive)
    public Book1 searchBook(String title) {
        fif (title == null) return null;
        return bookMap.get(title.toLowerCase());
    }
}
