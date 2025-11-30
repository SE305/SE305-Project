✅ Clear user interface flow
✅ Good user experience with exit option
🚨 Problem: No input validation or error handling
🔧 Suggestion: Add try-catch for scanner operations
🔧 Suggestion: Validate user input before processing
    
package test;

import java.util.Scanner;

// ================== (Presentation Layer) ==================
// Handles interaction with the user
public class LibraryApp {
    public static void main(String[] args) {
        startLibrarySystem();
    }

    // Method to start the library system (for testing purposes)
    public static void startLibrarySystem() {
        // This method contains the interactive loop - we can't test it in unit tests
        LibraryService library = new LibraryService();
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Welcome to My Library System =====");

        while (true) {
            System.out.print("Enter a book title to borrow, or type 'exit' to quit:\n ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for visiting! See you again.");
                break;
            }

            if (input.isEmpty()) {
                System.out.println("Please enter a valid book title.");
                continue;
            }

            String result = library.borrowBook(input);
            
            switch (result) {
                case "SUCCESS":
                    System.out.println("Enjoy reading! You borrowed: " + input);
                    break;
                case "NOT_FOUND":
                    System.out.println("The book \"" + input + "\" was not found in our library.");
                    break;
                case "ALREADY_BORROWED":
                    System.out.println("Sorry, \"" + input + "\" is already borrowed. Try another one.");
                    break;
                case "INVALID_INPUT":
                    System.out.println("Invalid input. Please enter a valid book title.");
                    break;
                default:
                    System.out.println("Unexpected error occurred.");
            }
        }
        sc.close();
    }
}
