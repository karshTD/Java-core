public class MultipleCatch{
    public static void main(String[] args){
try{
    int[] Array = {3, 4,5,2};
    int index = 10;
    int divisor = 0;

    int value = Array[index];
    int result = value/divisor;
}
catch( ArrayIndexOutOfBoundsException e){
    System.out.println("Array index is out of bounds");
}
catch( ArithmeticException e){
    System.out.println("something wrong with your maths lil bro");
    System.out.println("Exception error divided by 0");
}
catch( Exception  e){
    System.out.println("smth wrong idk what tho ");
    System.out.println("error : " + e.getMessage());
}

    }
}
