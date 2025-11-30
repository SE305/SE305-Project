//Output is checked loosely
//String.join() could be replaced by multiline text

import java.io.*;

public class MainTest {
    public static void main(String[] args) throws Exception {
        String simulatedInput = """
                 1
                101
                Java Basics
                John Doe
                2020
                1
                102
                OOP Concepts
                Jane Smith
                2022
                2
                3
                """;
        system.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        Main.main(new String[0]);

        System.setOut(originalOut);

        String output = outputStream.toString();

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
    }
}
