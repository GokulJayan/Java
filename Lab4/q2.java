import java.util.Scanner;

public class q2{

    public static boolean isValidTicket(long tID)
    {
        int flag=0;
        String str = String.valueOf(tID);
        if(str.length()==11)
        {
            long lastDigit = tID%10;
            long n = tID/10;
            if(lastDigit==n%7)
            flag=1;   
        }
        if(flag==1)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
            System.out.print("Enter ticket number   : ");
        long n=in.nextLong();
        String s = String.valueOf(n);
        if(s.length()==10)
        {
            n=(n*10)+(n%7);
            System.out.println("11 Digit Ticket number: "+n);  
        }
        if(isValidTicket(n))
        System.out.println("Ticket number is valid");
        else
        System.out.println("Kindly check and renter the ticket number");
    }
}

//2789654136