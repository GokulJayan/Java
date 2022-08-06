package packTest;

import pack3.Patient;
import pack4.Doctor;
import pack5.Nurse;

import java.util.Scanner;

public class HospitalDatabase{
    public static void main(String[] args)
    {
        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("Patients");
        System.out.print("Enter no: of Patients: ");
        int np=in.nextInt();
        Patient P[]= new Patient[np];
        for(i=0;i<np;i++)
        {
            P[i]=new Patient();
            System.out.println("\nPatient-"+(i+1));
            P[i].getName();
            P[i].getAadhar();    
            P[i].getPatientID();        
        }

        System.out.println("\nDoctors");
        System.out.print("Enter no: of Doctors: ");
        int nd=in.nextInt();
        Doctor D[]= new Doctor[nd];
        for(i=0;i<nd;i++)
        {
            D[i]=new Doctor();
            System.out.println("\nDoctor-"+(i+1));
            D[i].getName();
            D[i].getAadhar();
            D[i].getStaffID();
            D[i].getDept();            
        }

        System.out.println("\nNurses");
        System.out.print("Enter no: of Nurses: ");
        int nN=in.nextInt();
        Nurse N[]= new Nurse[nN];
        for(i=0;i<nN;i++)
        {
            N[i]=new Nurse();
            System.out.println("\nNurse-"+(i+1));
            N[i].getName();
            N[i].getAadhar();
            N[i].getStaffID();
            N[i].getRoom();            
        }

        System.out.println("\n\nPatients' Details:");
        for(i=0;i<np;i++)
        {
            System.out.println("\nPatient-"+(i+1));
            P[i].printName();
            P[i].printAadhar();
            P[i].printPatientID();
        }

        System.out.println("\n\nDoctors' Details:");
        for(i=0;i<nd;i++)
        {
            System.out.println("\nDoctor-"+(i+1));
            D[i].printName();
            D[i].printAadhar();
            D[i].printStaffID();
            D[i].printDept();
        }

        System.out.println("\n\nNurses' Details:");
        for(i=0;i<nN;i++)
        {
            System.out.println("\nNurse-"+(i+1));
            N[i].printName();
            N[i].printAadhar();
            N[i].printStaffID();
            N[i].printRoom();
        }
    }    
}
