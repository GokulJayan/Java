package pack2;
import pack1.Person;
import java.util.Scanner;
public class Staff extends Person {
    Scanner in = new Scanner(System.in);
    int StaffID;  

    public void getStaffID()
    {
        System.out.print("Enter Staff ID : ");
        StaffID=in.nextInt();
    }

    public void printStaffID()
    {
        System.out.println("Staff ID : "+StaffID);
    }
}
