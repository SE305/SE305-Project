public class LibraryService {
    private BookRepository repo;

    public LibraryService() {
        repo = new BookRepository();
    }

    public void borrowBook(String title) {
        Book book = repo.findBook(title);
        if (book == null) {
            System.out.println("The book '" + title + "' does not exist in the library.");
        } else if (!book.isAvailable()) {
            System.out.println("Sorry, the book '" + title + "' is already borrowed.");
        } else {
            book.borrow();
            System.out.println("You have successfully borrowed: " + book.getTitle());
        }
    }
}
