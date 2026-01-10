public class Symbiosis extends University{
    int id;

    Symbiosis(String name, String location, int id){
        super(name, location);
        this.id = id;
    }

    void univ(){
        info();
        System.out.println("university college id: "+  id);
    }




    
}
