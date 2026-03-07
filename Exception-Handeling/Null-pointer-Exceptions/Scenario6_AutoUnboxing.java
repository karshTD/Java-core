public class Scenario6_AutoUnboxing {
    public static void main(String[] args) {
        System.out.println("=== SCENARIO 6: Auto-unboxing null wrapper ===\n");
        
        Integer myInteger = null;  // Integer object (wrapper) is null
        
        System.out.println("Trying to auto-unbox null Integer to int...");
        System.out.println("(Auto-unboxing = Java automatically converts Integer to int)");
        
        try {
            int myPrimitive = myInteger;  // ❌ NPE HERE! Java tries to convert null to int
            System.out.println("int value: " + myPrimitive); // Won't print
        } catch (NullPointerException e) {
            System.out.println("✅ NULLPOINTEREXCEPTION CAUGHT!");
            System.out.println("Reason: Cannot auto-unbox 'myInteger' because it's null");
            System.out.println("Java tries to call myInteger.intValue() but myInteger is null!");
            System.out.println("myInteger = " + myInteger);
        }
        
        System.out.println("\n--- THE FIX: Check for null before unboxing ---");
        
        Integer safeInteger = null;
        if (safeInteger != null) {
            int value = safeInteger;
            System.out.println("Value: " + value);
        } else {
            System.out.println("Cannot unbox: safeInteger is null");
        }
        
        System.out.println("\nProgram continues normally after handling the exception.");
    }
}
