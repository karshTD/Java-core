// Example 2: StackOverflowError
// Happens when too many method calls fill the stack (infinite recursion)

class StackOverflowExample {

    static void recursiveMethod() {
        recursiveMethod();  // method calling itself endlessly
    }

    public static void main(String[] args) {
        recursiveMethod();
    }

    // Possible Output:
    // Exception in thread "main" java.lang.StackOverflowError
}
