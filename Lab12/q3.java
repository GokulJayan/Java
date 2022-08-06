import java.util.*;

class bank
{
    int ANo;
    String name, bname;
    double balance;
    
    Scanner in = new Scanner(System.in);
    
    bank()
    {
        System.out.print("Enter Account No: ");
        ANo=in.nextInt();
        System.out.print("Enter Name: ");
        name=in.next();
        System.out.print("Enter branch name: ");
        bname=in.next();
        System.out.print("Enter Balance: ");
        balance=in.nextDouble();
    }
}

public class q3 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i,n=10,ch;
        String branch;
        double dep=0;
        LinkedList <bank> list = new LinkedList <bank> ();
        
        for(i=0;i<n;i++)
        {
            System.out.println("\nEnter Details of Customer "+(i+1)+": ");
            bank b = new bank();
            list.add(b);
        }
        
        Iterator itr = list.iterator();
        System.out.println("\nAcc No\tName\tBranch\tBalance");
        while(itr.hasNext())
        {
            bank b=(bank)itr.next();
            System.out.println(b.ANo+"\t"+b.name+"\t"+b.bname+"\t"+b.balance);
        }
        
        while(true)
        {
            System.out.println("\n1. Display the details of the customers who have balance greater than Rs.50000");
            System.out.println("2. Display the sum of all the account holders in a particular branch\n3. Exit");
            System.out.print("Enter your choice: ");
            ch=in.nextInt();
            if(ch==1)
            {
                itr = list.iterator();
                System.out.println("\nAcc No\tName\tBranch\tBalance");
                while(itr.hasNext())
                {
                    bank b=(bank)itr.next();
                    if(b.balance>50000)
                    System.out.println(b.ANo+"\t"+b.name+"\t"+b.bname+"\t"+b.balance);                  
                }
            }

            else if(ch==2)
            {
                itr = list.iterator();
                System.out.print("Enter branch name: ");
                branch=in.next();

                System.out.println("\nAcc No\tName\tBranch\tBalance");
                while(itr.hasNext())
                {
                    bank b=(bank)itr.next();
                    if(b.bname.equals(branch))
                    {
                        System.out.println(b.ANo+"\t"+b.name+"\t"+b.bname+"\t"+b.balance);    
                        dep+=b.balance;
                    }              
                }
                System.out.println("\nTotal Deposit in "+branch+" branch: "+dep);
            }
        }
    }    
}

