//Basic inheritence code
class Animals{
    void eat(){
        System.out.println("this animal eats food");
    }
}

class Dog extends Animals{
    void bark(){
        System.out.println("dog barks");
    }
}

public class Main{
    public static void main(String[] args){
        Dog d = new Dog();
         d.eat();
         d.bark();   

    }
}
