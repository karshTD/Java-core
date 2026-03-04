// ArithmeticException Example
// Occurs when an illegal arithmetic operation happens (like divide by zero)

class ArithmeticExceptionDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        int result = a / b;   // division by zero

        System.out.println(result);

        // Output:
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
    }
}
