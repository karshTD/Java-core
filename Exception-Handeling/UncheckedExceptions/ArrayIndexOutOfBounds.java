// ArrayIndexOutOfBoundsException Example
// Occurs when accessing an invalid index of an array

class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30};

        System.out.println(arr[5]);   // invalid index

        // Output:
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
    }
}
