package pack3;
import pack1.Person;
import java.util.Scanner;
public class Patient extends Person {
    Scanner in = new Scanner(System.in);
    int PatientID;  

    public void getPatientID()
    {
        System.out.print("Enter Patient ID : ");
        PatientID=in.nextInt();
    }

    public void printPatientID()
    {
        System.out.println("Patient ID : "+PatientID);
    }
}