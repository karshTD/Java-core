// Example of a Checked Exception in Java
// Checked exceptions are verified at compile time and must be handled using try-catch or declared with throws.

import java.io.*;   // Required for FileReader and IOException

class CheckedExceptionExample {

    public static void main(String[] args) {

        try {
            // FileReader may throw IOException (a checked exception)
            FileReader file = new FileReader("test.txt");

            // If file exists, this line runs
            System.out.println("File opened successfully");

            file.close();
        }
        catch (IOException e) {   // Required handling of checked exception
            System.out.println("Checked Exception caught: File not found");
        }

        // Expected Output (if file does not exist):
        // Checked Exception caught: File not found
    }
}
