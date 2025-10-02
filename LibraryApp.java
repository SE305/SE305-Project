
import java.util.Scanner;

// ================== (Presentation Layer) ==================
// It interacts with the user (input/output) using Scanner.

public class LibraryApp {
    public static void main(String[] args) {
        // Create the service layer object
        LibraryService service = new LibraryService();
        Scanner scanner = new Scanner(System.in);

        System.out.println(" *******Welcome to the Online Library System!*******");
        // Main loop: keep asking user until they type "exit"
        while (true) {
            System.out.print("Type the name of a book to borrow, or 'exit' to close:\n ");
            String title = scanner.nextLine();

            if (title.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }
            // Try to borrow the requested book
            service.borrowBook(title);
        }
        // Close scanner after loop ends
        scanner.close();
    }
}
