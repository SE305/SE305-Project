//Missing title validation
package test;

// ================== (Business Layer) ==================
// Contains the main logic for borrowing books
public class LibraryService {
    private final BookRepository repository;

    // Constructor connects LibraryService to BookRepository
    public LibraryService() {
        repository = new BookRepository();
    }

    //Borrow book with title validation
    public void borrowBook(String title) {
        if(title == null || title.trim().isEmpty()){
            System.out.println("Invalid title. Please enter a valid bokk name.");
            return;
        }

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
