class Superclass {
    void method() {
        System.out.println("Super class method executed");
    }
}

class Subclass extends Superclass {
    @Override
    void method() throws ArithmeticException {
        System.out.println("Subclass method executed");
        throw new ArithmeticException("Exception in SubClass");
    }

    public static void main(String[] args) {
        Superclass s = new Subclass();
        try {
            s.method();
        } 
        catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
