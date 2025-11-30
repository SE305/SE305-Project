✅ Excellent encapsulation with private fields and public methods
✅ Clear constructor with proper initialization
🔧 Suggestion: Add input validation in constructor
🔧 Suggestion: Add method to mark book as returned/available again
    
package test;
// ================== (Entity Layer) ==================

// Represents a book with its title and availability
public class Book1 {
    private String title;
    private boolean isAvailable;

    // Constructor to make a new book (default available = true)
    public Book1(String title) {
        this.title = title;
        this.isAvailable = true;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter to check availability
    public boolean getStatus() {
        return isAvailable;
    }

    // Mark the book as borrowed
    public void markAsBorrowed() {
        this.isAvailable = false;
    }
}

