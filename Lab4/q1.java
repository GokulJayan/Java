import java.util.Scanner;

public class q1{

    public static int findGCD(int a, int b)
    {
        int i,min,GCD=1;
        min = (a < b) ? a : b;
        for(i=2;i<=min;i++)
        {
            if(a%i==0 && b%i==0)
            GCD=i;
        }
        return GCD;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1=in.nextInt();
        System.out.print("Enter second number: ");
        int n2=in.nextInt();
        System.out.println("GCD of "+n1+" and "+n2+" : "+findGCD(n1,n2));
    }
}