package library.ModelLayer;

/**
 * Represents a book in the library system.
 * This is part of the MODEL layer.
 */
public class Book {

    private String bookId;     // Unique ID for the book
    private String title;      // Book title
    private String author;     // Author name
    private boolean available; // True if the book is available for borrowing

    // Constructor: used when creating a new book object
    public Book(String bookId, String title, String author, boolean available) {if ( bookId==null || title==null || author==null ){
throw new IllegalArgumentException ("Book fields Cannot be null");
}
        if ( bookId==null || title==null || author==null ){
throw new IllegalArgumentException ("Book fields Cannot be null");
}
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.available = available;
    }

    // Getters (to read data)
    public String getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return available; }

    // Setter (to change availability status)
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Returns a readable string when we print the book object
    @Override
    public String toString() {
        return bookId + ": " + title + " by " + author + 
               (available ? " (Available)" : " (On Loan)");

}}
