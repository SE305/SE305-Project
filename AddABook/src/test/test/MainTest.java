package test;

import java.io.*;

public class MainTest {
    public static void main(String[] args) throws Exception {
        String simulatedInput = String.join("\n",
                "1", "101", "Java Basics", "John Doe", "2020",
                "1", "102", "OOP Concepts", "Jane Smith", "2022",
                "2", "3"
        ) + "\n";

        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            InputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
            System.setIn(inputStream);

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));

            Main.main(new String[0]);

            String output = outputStream.toString();

            // Print the captured program output
            System.out.println("=== Main Program Output ===");
            System.out.println(output);

            // Simple checks
            if (output.contains("Book added successfully.") &&
                    output.contains("Java Basics") &&
                    output.contains("OOP Concepts") &&
                    output.contains("Exiting program.")) {
                System.out.println("✅ MainTest passed!");
            } else {
                System.out.println("❌ MainTest failed!");
            }
        } finally {
            // Restore original System.in and System.out
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }
}