public class BankAccount{
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;

    }
 public int getAccountNumber(){
    return accountNumber;
 }

 public double getBalance(){
    return balance;
 }

 public void deposit(double amount){
    if(amount> 0){
        balance = balance + amount;
        System.out.println("Deposit Successful");
    
    }

    else {
        System.out.println("deposit unsuccessful");
    }
 }

public void withdraw(double amount){

    if(amount <= 0){
        System.out.println("Invalid withdrawal amount");
    }
    else if(amount > balance){
        System.out.println("Insufficient balance");
    }
    else{
        balance = balance - amount;
        System.out.println("Withdrawal successful");
    }

}


}
