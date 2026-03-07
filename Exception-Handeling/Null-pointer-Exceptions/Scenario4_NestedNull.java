public class Scenario4_NestedNull {
    
    static class Address {
        String city;
        String street;
    }
    
    static class Person {
        String name;
        Address address;  // Can be null!
    }
    
    public static void main(String[] args) {
        System.out.println("=== SCENARIO 4: Nested null objects ===\n");
        
        Person person = new Person();
        person.name = "John";
        person.address = null;  // Address is null!
        
        System.out.println("Person name: " + person.name); // Works fine
        System.out.println("Trying to access person.address.city...");
        
        try {
            String city = person.address.city;  // ❌ NPE HERE!
            System.out.println("City: " + city); // Won't print
        } catch (NullPointerException e) {
            System.out.println("✅ NULLPOINTEREXCEPTION CAUGHT!");
            System.out.println("Reason: 'person.address' is null, so we can't access 'city'");
            System.out.println("person.address = " + person.address);
        }
        
        System.out.println("\n--- THE FIX: Check each level ---");
        if (person != null && person.address != null) {
            System.out.println("City: " + person.address.city);
        } else {
            System.out.println("City: Unknown (address is null)");
        }
        
        System.out.println("\nProgram continues normally after handling the exception.");
    }
}
