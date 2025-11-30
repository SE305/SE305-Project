📝 Suggestion: Use JUnit instead of assertions
🔧 Suggestion: Add more test cases (edge cases, invalid inputs)
✅ Good: Covers basic functionality
    
public class BookTest {
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("101", "Java Basics", "John Doe", 2020);

        // Test getId()
        assert book.getId().equals("101") : "getId() failed";

        // Test toString()
        String expected = "[101] Java Basics by John Doe (2020)";
        assert book.toString().equals(expected) : "toString() failed";

        System.out.println("✅ BookTest passed!");
    }
}
