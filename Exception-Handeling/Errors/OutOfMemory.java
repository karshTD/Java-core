// Example 1: OutOfMemoryError
// Happens when JVM heap memory is exhausted

class OutOfMemoryExample {
    public static void main(String[] args) {

        // Continuously create objects until memory runs out
        int[] arr = new int[1000000000];

        System.out.println("Memory allocated");
    }

    // Possible Output:
    // Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
}
