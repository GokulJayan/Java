package pack1;

import java.util.Scanner;
public class Person {
    Scanner in = new Scanner(System.in);
    String Name;
    int Aadhar;  
    
    public void getName()
    {
        System.out.print("Enter Name     : ");
        Name=in.next();
    }

    public void getAadhar()
    {
        System.out.print("Enter Aadhar No: ");
        Aadhar=in.nextInt();
    }

    public void printName()
    {
        System.out.println("Name     : "+Name);
    }

    public void printAadhar()
    {
        System.out.println("Aadhar No: "+Aadhar);
    }
}
