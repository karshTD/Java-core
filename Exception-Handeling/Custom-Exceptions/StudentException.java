// Custom exception with multiple constructors
class StudentException extends Exception {
    // Constructor 1: Only message
    public StudentException(String message) {
        super(message);
    }
    
    // Constructor 2: Message + cause (for chaining)
    public StudentException(String message, Throwable cause) {
        super(message, cause);
    }
}

class Student {
    private String name;
    private int age;
    
    public void setName(String name) throws StudentException {
        if (name == null || name.trim().isEmpty()) {
            throw new StudentException("Student name cannot be empty");
        }
        this.name = name;
    }
    
    public void setAge(int age) throws StudentException {
        if (age < 0 || age > 150) {
            throw new StudentException("Age " + age + " is out of valid range (0-150)");
        }
        this.age = age;
    }
}

public class TestMultipleConstructors {
    public static void main(String[] args) {
        Student s = new Student();
        
        try {
            s.setName("");  // Empty name - will throw exception
        } catch (StudentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        try {
            s.setAge(200);  // Invalid age - will throw exception
        } catch (StudentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
