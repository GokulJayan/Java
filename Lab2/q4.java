//Silver for every 2nd customer and Gold for every 5th customer

import java.util.Scanner;

public class q4
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);  
        int n,i,silver=0,gold=0;
        String[] names=new String[100];
        System.out.print("Enter no:of customers: ");
        n=in.nextInt();
        System.out.println("Enter names of "+n+" customers: ");
        for(i=0;i<=n;i++)
        names[i]=in.nextLine();
        System.out.println();
        System.out.println("Winners:");
        for(i=1;i<=n;i++)
        {
            if(i%2==0 && i%5==0)
            {
                gold++;
                System.out.println("Customer-"+i+" : "+names[i]+" -Gold");
            }
            else if(i%2==0)
            {
                silver++;
                System.out.println("Customer-"+i+" : "+names[i]+" -Silver");
            }
            else if(i%5==0)
            {
                gold++;
                System.out.println("Customer-"+i+" : "+names[i]+" -Gold");
            }
        }
        System.out.println();
        System.out.println("No:of Silver Winners: "+silver);
        System.out.println("No:of Gold Winners  : "+gold);
    }
}