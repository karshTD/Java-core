// Example of ClassNotFoundException (Checked Exception)

class ClassNotFoundExample {

    public static void main(String[] args) {

        try {
            // Trying to load a class that does not exist
            Class.forName("TestClass");

            System.out.println("Class found");
        }
        catch (ClassNotFoundException e) {   // Checked exception must be handled
            System.out.println("Class not found exception caught");
        }

        // Expected Output:
        // Class not found exception caught
    }
}
