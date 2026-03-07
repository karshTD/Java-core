public class Scenario1_MethodCall {
    public static void main(String[] args) {
        System.out.println("=== SCENARIO 1: Method call on null ===\n");
        
        String myString = null;  // String reference points to nothing
        
        System.out.println("Trying to call length() on null string...");
        
        try {
            int length = myString.length();  // ❌ NPE HERE!
            System.out.println("Length: " + length); // This won't print
        } catch (NullPointerException e) {
            System.out.println("✅ NULLPOINTEREXCEPTION CAUGHT!");
            System.out.println("Reason: Cannot call 'length()' on 'myString' because it's null");
            System.out.println("myString = " + myString);
        }
        
        System.out.println("\nProgram continues normally after handling the exception.");
    }
}
