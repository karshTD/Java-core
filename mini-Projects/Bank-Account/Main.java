import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       System.out.print("enter account number: ");
       int accNo = sc.nextInt();

       System.out.print("enter initial balance: ");
       double balance = sc.nextDouble();

       BankAccount account = new BankAccount(accNo, balance);

       System.out.print("enter deposit amount: ");
       double depositAmount = sc.nextDouble();
       account.deposit(depositAmount);

       System.out.println("Current balance: " + account.getBalance());

        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        System.out.println("Final balance: " + account.getBalance());

        sc.close();
    }


    }
