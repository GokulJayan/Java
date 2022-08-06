import java.util.Scanner;

public class q3 
{
    static double distance(int x1, int y1, int x2, int y2)
    {
        double d=Math.sqrt(Math.pow(x2 - x1,2 ) + Math.pow(y2 - y1, 2));
        return d;
    }

    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        int x1,y1,x2,y2;
        System.out.print("Enter x-coordinate of 1st point: ");
        x1=in.nextInt();
        System.out.print("Enter y-coordinate of 1st point: ");
        y1=in.nextInt();
        System.out.print("Enter x-coordinate of 2nd point: ");
        x2=in.nextInt();
        System.out.print("Enter y-coordinate of 2nd point: ");
        y2=in.nextInt();
        
        System.out.println();
        System.out.println("Distance between 2 points: "+distance(x1,y1,x2,y2));
    }
}

