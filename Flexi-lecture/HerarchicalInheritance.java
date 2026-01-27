class Car{
    void speed(){
        System.out.println("cars are fast");
    }
}

class Audi extends Car{
    void fast(){
        System.out.println("audi is very fast");
    }
}
class Ferari extends Car{
    void nice(){
        System.out.println("ferari is nice");
    }
}

public class HerarchicalInheritance{
    public static void main(String[] args){
        Audi a = new Audi();
            a.speed();
            a.fast();
        Ferari f = new Ferari();
    f.nice();
f      .speed();
    }
}
