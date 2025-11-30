✅ Clear business logic for borrowing books
✅ Proper status checking workflow
🚨 Critical: Mixing business logic with UI output (System.out.println)
🔧 Suggestion: Return status codes or throw exceptions instead of printing
🔧 Suggestion: Use dependency injection instead of hard-coded repository
    
package test;

// ================== (Business Layer) ==================
// Contains the main logic for borrowing books
public class LibraryService {
    private BookRepository repository;

    // Constructor connects LibraryService to BookRepository
    public LibraryService() {
        repository = new BookRepository();
    }

     public String borrowBook(String title) {
        if (title == null || title.trim().isEmpty()) {
            return "INVALID_INPUT";
        }
        
        Book1 book = repository.searchBook(title);

        if (book == null) {
            return "NOT_FOUND";
        } else if (!book.getStatus()) {
            return "ALREADY_BORROWED";
        } else {
            book.markAsBorrowed();
            return "SUCCESS";
        }
    }

    public String returnBook(String title) {
        if (title == null || title.trim().isEmpty()) {
            return "INVALID_INPUT";
        }
        
        Book1 book = repository.searchBook(title);

        if (book == null) {
            return "NOT_FOUND";
        } else if (book.getStatus()) {
            return "ALREADY_RETURNED";
        } else {
            book.markAsReturned();
            return "RETURN_SUCCESS";
        }
    }
}
