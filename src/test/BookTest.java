package test;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("101", "Java Basics", "John Doe", 2020);

        // استبدلي الـ assert بـ if
        if (!book.getId().equals("101")) {
            System.out.println("❌ getId() failed");
            return;
        }

        String expected = "[101] Java Basics by John Doe (2020)";
        if (!book.toString().equals(expected)) {
            System.out.println("❌ toString() failed");
            return;
        }

        System.out.println("✅ BookTest passed!");
    }
}
