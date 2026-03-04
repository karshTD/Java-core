public class TryCatch {


    public static void main(String[] args){
        int n1 = 10;
        int n2 = 0;

        try{
            System.out.println("Inside try block");
            int result = n1/n2;
            System.out.println("Result: " + result);
            System.out.println("this wont print");
        }

        catch(ArithmeticException e){
            System.out.println("Exception caught: cannot divide by 0");
            System.out.println("Exception details: " + e.getMessage());

        
        }

                System.out.println("Program continues normally after exception handling");
    }

//Inside try block
//Exception caught: cannot divide by 0
//Exception details: / by zero
//Program continues normally after exception handling//
