package test;

// ================== (Business Layer) ==================
// Contains the main logic for borrowing books
public class LibraryService {
    private BookRepository repository;

    // Constructor connects LibraryService to BookRepository
    public LibraryService() {
        repository = new BookRepository();
    }

    // Try to borrow a book by title
    public void borrowBook(String title) {
        Book1 book = repository.searchBook(title);

        if (book == null) {
            System.out.println("The book \"" + title + "\" was not found in our library.");
        } else if (!book.getStatus()) {
            System.out.println("Sorry, \"" + book.getTitle() + "\" is already borrowed. Try another one.");
        } else {
            book.markAsBorrowed();
            System.out.println("Enjoy reading! You borrowed: " + book.getTitle());
        }
    }

}
