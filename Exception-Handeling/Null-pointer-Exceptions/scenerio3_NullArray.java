public class Scenario3_NullArray {
    public static void main(String[] args) {
        System.out.println("=== SCENARIO 3: Array is null ===\n");
        
        int[] numbers = null;  // Array reference points to nothing
        
        System.out.println("Trying to access index 0 of null array...");
        
        try {
            int firstNumber = numbers[0];  // ❌ NPE HERE!
            System.out.println("First number: " + firstNumber); // Won't print
        } catch (NullPointerException e) {
            System.out.println("✅ NULLPOINTEREXCEPTION CAUGHT!");
            System.out.println("Reason: Cannot access array index on 'numbers' because the array itself is null");
            System.out.println("numbers = " + numbers);
        }
        
        System.out.println("\n--- IMPORTANT: NULL vs EMPTY ARRAY ---");
        
        int[] emptyArray = new int[0];  // This is EMPTY, not NULL
        System.out.println("Empty array (new int[0]) = " + emptyArray);
        System.out.println("Empty array length = " + emptyArray.length); // This works!
        System.out.println("Empty array is an actual object, just with no elements");
        
        System.out.println("\nProgram continues normally after handling the exception.");
    }
}
