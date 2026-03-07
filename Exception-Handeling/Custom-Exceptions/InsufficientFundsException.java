// Step 1: Create custom exception (Checked)
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);  // Pass message to parent Exception class
    }
}

// Step 2: Use it in your application
class BankAccount {
    private double balance = 1000;
    
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            // Step 3: Throw custom exception
            throw new InsufficientFundsException(
                "Cannot withdraw $" + amount + ". Balance: $" + balance
            );
        }
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
    }
}

// Step 4: Test it
public class TestCustomException {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        try {
            account.withdraw(1500);  // More than balance
        } catch (InsufficientFundsException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }
    }
}
