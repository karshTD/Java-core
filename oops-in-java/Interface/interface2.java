interface Car{
    void Speed();
}

class Audi implements Car{
    public void Speed(){
       int  n = 124;
        System.out.println("top speed of r8: "  + n );
    }
}

public class InterfaceExample2{
    public static void main(String[] args){
        Car s = new Audi();
        s.Speed();
    }
}
