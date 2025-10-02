import java.util.Scanner;

// ================== (Presentation Layer) ==================
// Handles interaction with the user
public class LibraryApp {
    public static void main(String[] args) {
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

            library.borrowBook(input);
        }
        sc.close();
    }
}
