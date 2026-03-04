// Example 3: VirtualMachineError
// Parent class of serious JVM errors (OutOfMemoryError, StackOverflowError etc.)


class VirtualMachineErrorExample {

    public static void main(String[] args) {

        try {
            // Force large memory allocation
            int[] arr = new int[1000000000];
        }
        catch (VirtualMachineError e) {
            System.out.println("Virtual Machine Error occurred");
        }

        // Possible Output:
        // Virtual Machine Error occurred
    }
}
