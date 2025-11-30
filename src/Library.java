⚠️ Performance: O(n) duplicate check - use HashMap for O(1)
🔧 Suggestion: Add removeBook() method for complete functionality
✅ Good: Clear logic and error handling
    
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private Map<String, Book>bookMap;

    public Library() {
        books = new ArrayList<>();
    }

    public boolean addBook(Book book) {
        //o(1) duplicate check using HasMap
        if(bookMap.containsKey(book.getId()){
            return false;
        }
    
        books.add(book);
        bookMap.put(book.getId(),book);
        return true;
    }

    // NEW: Remove book method
    public boolean removeBook(String bookId) {
        Book book = bookMap.get(bookId);
        if (book != null) {
            books.remove(book);
            bookMap.remove(bookId);
            return true;
        }
        return false;
    }
 
    // NEW: Search book by ID
    public Book searchBook(String bookId) {
        return bookMap.get(bookId);
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty.");
        } else {
            System.out.println("Books in library:");
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }
}
