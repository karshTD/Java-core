abstract class Shape{
    abstract void draw();
    
    void message(){
        System.out.println("this is a shape");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape{
    void draw(){
        System.out.println("Drawing a square");
    }
}

public class AbstractExample{
    public static void main(String[] args){
        Shape s = new Circle();
        s.draw();
        s.message();

        Shape r = new Square();
        r.draw();
    }
}
