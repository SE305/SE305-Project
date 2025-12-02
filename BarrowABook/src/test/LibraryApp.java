//Hard to test
package test;

import java.io.InputStream;
import java.util.Scanner;

// ================== (Presentation Layer) ==================
// Handles interaction with the user
public class LibraryApp {
    public static void main(String[] args) {
        startLibrarySystem(System.in);
    }

    // Method to start the library system (for testing purposes)
    public static void startLibrarySystem(InputStream input) {
        // This method contains the interactive loop - we can't test it in unit tests
        LibraryService library = new LibraryService();
        Scanner sc = new Scanner(input);

        System.out.println("===== Welcome to My Library System =====");

        while (true) {
            System.out.print("Enter a book title to borrow, or type 'exit' to quit:\n ");
            String userInput = sc.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for visiting! See you again.");
                break;
            }

            library.borrowBook(userInput);
        }
        sc.close();
    }
}
