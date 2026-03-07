public class Scenario5_ArrayLength {
    public static void main(String[] args) {
        System.out.println("=== SCENARIO 5: Getting length of null array ===\n");
        
        int[] numbers = null;  // Array reference points to nothing
        
        System.out.println("Trying to get length of null array...");
        
        try {
            int arrayLength = numbers.length;  // ❌ NPE HERE!
            System.out.println("Array length: " + arrayLength); // Won't print
        } catch (NullPointerException e) {
            System.out.println("✅ NULLPOINTEREXCEPTION CAUGHT!");
            System.out.println("Reason: Cannot get 'length' of 'numbers' because the array is null");
            System.out.println("numbers = " + numbers);
        }
        
        System.out.println("\n--- COMPARISON ---");
        
        int[] validArray = {1, 2, 3, 4, 5};
        System.out.println("Valid array length: " + validArray.length); // Works: 5
        
        int[] emptyArray = new int[0];
        System.out.println("Empty array length: " + emptyArray.length); // Works: 0
        
        System.out.println("\nProgram continues normally after handling the exception.");
    }
}
