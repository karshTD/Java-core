// Step 1: Create custom exception (Unchecked - extends RuntimeException)
class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Step 2: Use it in voting application
class Voter {
    public void checkEligibility(int age) {
        if (age < 0 || age > 150) {
            // No throws keyword needed for unchecked!
            throw new InvalidAgeException("Age " + age + " is invalid");
        }
        if (age < 18) {
            System.out.println("Not eligible to vote. Wait " + (18 - age) + " more years.");
        } else {
            System.out.println("Eligible to vote!");
        }
    }
}

// Step 3: Test it
public class TestUncheckedException {
    public static void main(String[] args) {
        Voter voter = new Voter();
        
        // No try-catch required (unchecked), but we use it for graceful handling
        try {
            voter.checkEligibility(-5);  // Invalid age
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        voter.checkEligibility(20);  // Valid age - works fine
    }
}
