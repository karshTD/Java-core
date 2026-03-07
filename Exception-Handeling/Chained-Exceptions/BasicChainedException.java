public class BasicChainedException {
    
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
            System.out.println("Root cause: " + e.getCause().getMessage());
            System.out.println("\n--- Full Stack Trace ---");
            e.printStackTrace();  // Shows complete chain
        }
    }
    
    public static void method1() throws Exception {
        try {
            method2();  // This throws ArithmeticException
        } catch (ArithmeticException e) {
            // Chain the ArithmeticException to a new Exception
            throw new Exception("Error in method1", e);  // e is the CAUSE
        }
    }
    
    public static void method2() {
        // Original exception (root cause)
        throw new ArithmeticException("Division by zero in method2");
    }
}
