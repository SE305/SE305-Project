package library.testproject;

import library.App;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    public void testAppMainRuns() {
        // Simulate user input for ConsoleUI: Member ID, Book ID, empty return date
        String simulatedInput = "M1\nB1\n\n";
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(in); // redirect System.in

        // Capture System.out
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Run the main method
        App.main(new String[]{});

        // Convert output to String
        String output = outContent.toString();

        // Verify output contains "Receipt" or "Book" as proof that it ran
        assertTrue(output.contains("Book:") || output.contains("Receipt ID:"), "Output should contain receipt info");

        // Reset System.in and System.out if needed (optional).
        System.setIn(System.in);
        System.setOut(System.out);
    }
}
