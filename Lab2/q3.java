import java.util.Scanner;

public class q3
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);  
        int days, d, pay=25, total=0;
        System.out.print("Enter no:of days: ");
        days=in.nextInt();
        d=days;
        while(days>0)
        {
            total=total+pay;
            pay=pay*2;
            days--;
        }
                
        System.out.println("Total after "+d+" days: "+total);
    }
}