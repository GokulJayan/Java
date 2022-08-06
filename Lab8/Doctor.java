package pack4;

import pack2.Staff;
import java.util.Scanner;
public class Doctor extends Staff 
{
    Scanner in = new Scanner(System.in);
    String Dept;  

    public void getDept()
    {
        System.out.print("Enter Department: ");
        Dept=in.next();
    }

    public void printDept()
    {
        System.out.println("Department : "+Dept);
    }
}