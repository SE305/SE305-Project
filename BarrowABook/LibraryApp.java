import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryService service = new LibraryService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Online Library!");

        while (true) {
            System.out.print("Enter the title of the book you want to borrow (or type 'exit' to quit): ");
            String title = scanner.nextLine();

            if (title.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            service.borrowBook(title);
        }

        scanner.close();
    }
}
