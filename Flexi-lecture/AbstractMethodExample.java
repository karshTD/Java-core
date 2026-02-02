abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("this animals eats");
    }
}

class Dog extends Animal{
    void sound(){
        
        System.out.println("dog barks");
    }
}

public class AbstractMethodExample{
    public static void main(String[] args){
    Animal animal = new Dog();
    animal.sound();
    animal.eat();
    }
}
