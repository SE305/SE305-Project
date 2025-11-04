package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        System.out.println("=== Online Library Management System ===");

        while (true) {
            System.out.println("\n1. Add Book\n2. List Books\n3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    Book newBook = new Book(id, title, author, year);
                    boolean added = library.addBook(newBook);
                    if (added) {
                        System.out.println("Book added successfully.");
                    } else {
                        System.out.println("Book ID already exists. Book not added.");
                    }
                    break;
                case 2:
                    library.listBooks();
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}