import java.util.Scanner;

public class Addition {
   public Addition() {
   }

   public static void main(String[] var0) {
      System.out.println("Enter two numbers");
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      int var3 = var1.nextInt();
      int var4 = var2 + var3;
      System.out.println(var4);
   }
}
