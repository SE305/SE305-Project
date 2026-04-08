//Duplicate imports

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.FileDescriptor;


public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();

        // Test adding books
        Book book1 = new Book("101", "Java Basics", "John Doe", 2020);
        Book book2 = new Book("102", "OOP Concepts", "Jane Smith", 2022);
        Book duplicate = new Book("101", "Duplicate Book", "Someone", 2023);

        boolean test1 = library.addBook(book1);
        boolean test2 = library.addBook(book2);
        boolean test3 = !library.addBook(duplicate); // should be false

        // Capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        printStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        library.listBooks();

        System.setOut(originalOut);

        if (test1 && test2 && test3) {
            System.out.println("✅ Add book tests passed!");
        } else {
            System.out.println("❌ Add book tests failed!");
        }

        System.out.println("=== Library Listing ===");
        System.out.println(outputStream.toString());
    }
}
