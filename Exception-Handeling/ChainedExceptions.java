//chained exceptions 
//chained exceptions in java enable linking one exceptoonm to another allowong an exception to indicate the root cause of an error for instance if a method throws an arithmetic exceptioms due to division by zero but the actual issue stems from an io failure that resulted in a zero divisor chanined esceptions helps convey both the immediate error and its underlying cause 

public class ExCP{
    public static void main(String[] args){
        try{
            int[] n = new int[5];
            int divisor = 0;

            for(int i = 0; i < n.length; i++){
                int res = n[i] / divisor;
                System.out.println(res);


            }
        }
        catch(ArithmeticException e){
            throw new RuntimeException("error: division by zero occured" , e);

        }
    }
}
