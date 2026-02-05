class Hospital{
    void hospitalInfo(){
        System.out.println("This is a general hospital.");
    }
}
class DOCTOR extends Hospital{
    void doctors(){
        System.out.println("This hospital has many specialized doctors.");
   
    void doctorInfo
(String name, String specialization, int experience){
        System.out.println("Doctor Name: " + name + ", Specialization: " + specialization + ", Experience: " + experience + " years");
    }
}
}

class Patient extends Hospital{
    void patients(){
        System.out.println("This hospital has many patients.");
    }
    void patientInfo(String name, int age, String ailment){
        System.out.println("Patient Name: " + name + ", Age: " + age + ", Ailment: " + ailment);
    }
}

public class Main {
    public static void main(String[] args) {
        DOCTOR doc = new DOCTOR();
        doc.hospitalInfo();
        doc.doctors();
        doc.doctorInfo("Dr. Smith", "Cardiology", 15);

        Patient pat = new Patient();
        pat.hospitalInfo();
        pat.patients();
        pat.patientInfo("John Doe", 45, "Flu");
    }
}
