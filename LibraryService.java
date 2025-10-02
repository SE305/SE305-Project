
// ================== (Business Layer) ==================
// checks if a book exists, if it is available, and manages borrowing.

public class LibraryService {
    private BookRepository repo;

    public LibraryService() {
        repo = new BookRepository();
    }     // Constructor to connect LibraryService with the BookRepository


    public void borrowBook(String title) {  // borrow a book by title

        Book book = repo.findBook(title);

        // Check if the book exists in the repository
        if (book == null) {
            System.out.println("❌ The book '" + title + "' does not exist in the library.");
        } else if (!book.isAvailable()) {
            System.out.println("❌ Sorry, the book '" + title + "' is already borrowed,Please choose another.");
        } else {
            book.borrow();
            System.out.println("✅ You have successfully borrowed: " + book.getTitle());
        }
    }
}
