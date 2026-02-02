class Demo{
    
    Demo(){
        this("default constructor");
    }
    Demo(String message){
        System.out.println(message);
    }
    Demo(int number){
        System.out.println(number);
    }
}

public class Main{
    public static void main(String[] args){
        new Demo();
        new Demo(500);
    }
}
