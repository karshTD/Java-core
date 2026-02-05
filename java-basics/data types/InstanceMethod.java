class Student {
    String name;
    
    void display() {  // Instance method
        System.out.println("Name: " + name);
    }
}

// Usage:
Student s1 = new Student();
s1.name = "John";
s1.display();  // Called on object
