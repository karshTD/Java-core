public class ThrowVsThrowsCompleteDemo {
    
    // Example 1: Using throws to declare checked exception
    public static void readFile(String filename) throws IOException {
        // This method declares it MIGHT throw IOException
        if (filename == null) {
            // Using throw to ACTUALLY throw the exception
            throw new IOException("Filename cannot be null");
        }
        System.out.println("Reading file: " + filename);
    }
    
    // Example 2: Multiple exceptions in throws
    public static void processData(String data) throws IOException, ArithmeticException {
        if (data == null) {
            throw new IOException("Data is null");
        }
        if (data.isEmpty()) {
            throw new ArithmeticException("Cannot process empty data");
        }
    }
    
    // Example 3: throw for custom exception
    public static void validateAge(int age) {
        if (age < 0) {
            // throw for unchecked exception
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if (age < 18) {
            System.out.println("Minor - restricted access");
        } else {
            System.out.println("Adult - full access");
        }
    }
    
    public static void main(String[] args) {
        // Handling methods that declare throws
        try {
            readFile(null); // This will throw the exception
        } catch (IOException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        
        // Methods with throw (unchecked) - handling optional
        try {
            validateAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }
        
        // Multiple exception handling
        try {
            processData("");
        } catch (IOException | ArithmeticException e) { // Multi-catch (Java 7+)
            System.out.println("Error: " + e.getMessage());
        }
    }
}
