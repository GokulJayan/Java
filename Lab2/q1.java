import java.util.Scanner;

public class q1
{
  public static void main (String args[])
  {    
    Scanner in = new Scanner(System.in);
    int n,i;
    float t,l,total;
    System.out.print("Enter no:of Students: ");
    n=in.nextInt();
    for(i=0;i<n;i++)
    {
      System.out.println("Student "+(i+1)+": ");
      System.out.print("Enter Theory Marks: ");
      t=in.nextFloat();
      System.out.print("Enter Lab Marks: ");
      l=in.nextFloat();
      if(t>50 || l>50)
      System.out.println("One component mark exceeds 50");
      else
      {
         if(t<15 || l<15)
         System.out.println("Failed");
         else
         {
           total=(t+l);
           if(total==39)
           {
             total=40;
             System.out.println("Passed");
           }
           else if(total>=40)
           System.out.println("Passed");
           else
           System.out.println("Failed");
         }
      }
      System.out.println();
    }
  }
}