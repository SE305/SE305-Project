//Using assert without enabling JVM assertions

public class BookTest {
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("101", "Java Basics", "John Doe", 2020);

        // Test getId()
        if (!book.getId().equals("101")) {
            System.out.println("❌ getId() failed");
        }

        // Test toString()
        String expected = "[101] Java Basics by John Doe (2020)";
        if (!book.toString().equals(expected)) {
            System.out.println("❌ toString() failed");
        }

        System.out.println("✅ BookTest passed!");
    }
}
