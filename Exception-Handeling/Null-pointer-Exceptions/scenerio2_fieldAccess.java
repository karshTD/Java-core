public class Scenario2_FieldAccess {
    
    static class Student {
        String name;
        int age;
    }
    
    public static void main(String[] args) {
        System.out.println("=== SCENARIO 2: Accessing field of null object ===\n");
        
        Student student = null;  // Student reference points to nothing
        
        System.out.println("Trying to access 'name' field on null student...");
        
        try {
            String studentName = student.name;  // ❌ NPE HERE!
            System.out.println("Student name: " + studentName); // Won't print
        } catch (NullPointerException e) {
            System.out.println("✅ NULLPOINTEREXCEPTION CAUGHT!");
            System.out.println("Reason: Cannot access field 'name' on 'student' because it's null");
            System.out.println("student = " + student);
        }
        
        System.out.println("\nProgram continues normally after handling the exception.");
    }
}
