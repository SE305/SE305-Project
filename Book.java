
// ================== (Entity Layer) ==================

// thiss contains book title and availability status.
public class Book {
    private String title;
    private boolean available;

    // Constructor to create a new book
    public Book(String title) {
        this.title = title;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }  // ( Getter) return the title of the book

    public boolean isAvailable() {
        return available;
    }  // (Getter) check if the book is available to borrow



    public void borrow() {
        this.available = false;
    }   // borrow the book (set availability to false)

}
