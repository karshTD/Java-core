// NullPointerException Example
// Occurs when we try to use an object that is null

class NullPointerExceptionDemo {
    public static void main(String[] args) {

        String str = null;

        System.out.println(str.length());   // calling method on null

        // Output:
        // Exception in thread "main" java.lang.NullPointerException
    }
}
