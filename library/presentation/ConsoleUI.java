package library.presentation;

import java.time.LocalDate;
import java.util.Scanner;

/** Simple Console UI for "Return Book". */
public class ConsoleUI {
    public void runOnce() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Member ID: ");
        String memberId = sc.nextLine();

        System.out.print("Book ID: ");
        String bookId = sc.nextLine();

        System.out.print("Return Date (YYYY-MM-DD or empty for today): ");
        String input = sc.nextLine().trim();
        LocalDate returnDate = input.isEmpty() ? LocalDate.now() : LocalDate.parse(input);

        System.out.println("\n--- Input Summary ---");
        System.out.println("Member ID : " + memberId);
        System.out.println("Book ID   : " + bookId);
        System.out.println("Return Dt : " + returnDate);

        System.out.println("\n[TODO] Business logic will be added later.");
    }
}
