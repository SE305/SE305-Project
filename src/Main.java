🚨 Critical: Missing input validation for year field
🔧 Suggestion: Add try-catch for NumberFormatException  
🔧 Suggestion: Add menu option to search books
✅ Good: User-friendly menu system
    
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        System.out.println("=== Online Library Management System ===");

        try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        addBookMenu(scanner, library);
                        break;
                    case 2:
                        library.listBooks();
                        break;
                    case 3:
                        searchBookMenu(scanner, library);
                        break;
                    case 4:
                        removeBookMenu(scanner, library);
                        break;
                    case 5:
                        System.out.println("Exiting program. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter 1-5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number!");
            }
        }
    }
 
    private static void addBookMenu(Scanner scanner, Library library) {
        System.out.print("Enter Book ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter Year: ");
        try {
            int year = Integer.parseInt(scanner.nextLine());
            Book newBook = new Book(id, title, author, year);
            boolean added = library.addBook(newBook);
            if (added) {
                System.out.println("✅ Book added successfully.");
            } else {
                System.out.println("❌ Book ID already exists. Book not added.");
            }
        } catch (NumberFormatException e) {
            System.out.println("❌ Error: Please enter a valid year number!");
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
 
    private static void searchBookMenu(Scanner scanner, Library library) {
        System.out.print("Enter Book ID to search: ");
        String id = scanner.nextLine();
        Book book = library.searchBook(id);
        if (book != null) {
            System.out.println("✅ Book found: " + book);
        } else {
            System.out.println("❌ Book not found.");
        }
    }
 
    private static void removeBookMenu(Scanner scanner, Library library) {
        System.out.print("Enter Book ID to remove: ");
        String id = scanner.nextLine();
        boolean removed = library.removeBook(id);
        if (removed) {
            System.out.println("✅ Book removed successfully.");
        } else {
            System.out.println("❌ Book not found.");
        }
    }
}
