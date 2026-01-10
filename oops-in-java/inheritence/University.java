public class University{
    String name;
    String location;

    University(String name, String location){
        this.name = name;
        this.location = location;

    }

    void info(){
        System.out.println("name of the university" + name + "location: " + location);
    }
}
