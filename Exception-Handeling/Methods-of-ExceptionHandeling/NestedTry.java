public class NestedTryDemo {
    public static void main(String[] args) {
        // OUTER TRY
        try {
            System.out.println("Outer try starts");
            int[] data = {10, 20, 30, 40, 50};
            int outerDivisor = 2;
            
            // INNER TRY - Level 1
            try {
                System.out.println("  Inner try - Level 1 starts");
                int innerResult1 = data[2] / 2; // Safe division
                System.out.println("  Inner Level 1 result: " + innerResult1);
                
                // INNER TRY - Level 2 (nested inside inner try)
                try {
                    System.out.println("    Inner try - Level 2 starts");
                    int innerResult2 = data[5] / 0; // Array index problem AND division by zero
                    System.out.println("    This won't print");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("    Caught at Level 2: Index out of bounds!");
                }
                
            } catch (ArithmeticException e) {
                System.out.println("  Caught at Level 1: Arithmetic error!");
            }
            
            int outerResult = data[1] / outerDivisor;
            System.out.println("Outer try result: " + outerResult);
            
        } catch (Exception e) {
            System.out.println("Outer catch: " + e.getMessage());
        }
        
        System.out.println("Program continues after nested tries");
    }
}
