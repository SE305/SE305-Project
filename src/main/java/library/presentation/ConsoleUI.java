package library.presentation;

import java.time.LocalDate;
import java.util.Scanner;
import library.business.ReturnService;

/**
 * Minimal console UI for the \"Return Book\" use case.
 */
public class ConsoleUI {
    private final ReturnService service;

    public ConsoleUI(ReturnService service) {
        this.service = service;
    }

    /** Reads input once and prints the receipt/result. */
    public void runOnce() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Member ID: ");
        String memberId = sc.nextLine();

        System.out.print("Book ID: ");
        String bookId = sc.nextLine();

        System.out.print("Return Date (YYYY-MM-DD or empty for today): ");
        String input = sc.nextLine().trim();
        LocalDate date = input.isEmpty() ? LocalDate.now() : LocalDate.parse(input);

        String result = service.processReturn(memberId, bookId, date);
        System.out.println("\n" + result);
    }
}


