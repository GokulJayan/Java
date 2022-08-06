import java.util.Scanner;

public class q2 
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);  
        int type;  
        double R,L,D,A,P;
        
        System.out.println("1.Copper(1.78*10^-8)   2.Silicon(2300)");
        System.out.println();
        System.out.print("Enter type of wire: ");
        type=in.nextInt();
        if(type==1)
        P=1.78*(Math.pow(10,-8));
        else
        P=2300;
        System.out.print("Enter length in meters: ");
        L=in.nextDouble();
        System.out.print("Enter diameter in mm: ");
        D=in.nextDouble();
        D=D/1000;
        A=3.14*(Math.pow(D/2,2));
        R=P*(L/A);
        System.out.print("Resistance: "+R+" ohm");
    }
}