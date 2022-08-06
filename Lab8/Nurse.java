package pack5;

import pack2.Staff;
import java.util.Scanner;
public class Nurse extends Staff 
{
    Scanner in = new Scanner(System.in);
    int Room;  

    public void getRoom()
    {
        System.out.print("Enter Room No: ");
        Room=in.nextInt();
    }

    public void printRoom()
    {
        System.out.println("Room No: "+Room);
    }
}