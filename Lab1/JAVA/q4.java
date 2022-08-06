import java.util.Scanner;
public class q4 
{
    static double area(double h, double b)
    {
        return h*b;
    }

    static double area(double t, double b, double h)
    {
        return h*((t+b)/2); 
    }

    static double area(double r)
    {
        return 3.14*r*r;
    }

    
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int choice; 
        double A=0;

        System.out.println("1.Rectangle  2.Trapezoid  3.Circle");
        System.out.print("Enter your choice: ");
        choice=in.nextInt();
    
        if(choice==1)
        {
            double hR,bR;
            System.out.print("Enter height of rectangle: ");
            hR=in.nextDouble();
            System.out.print("Enter base of rectangle: ");
            bR=in.nextDouble();
            A=area(hR,bR);
        }
        else if(choice==2)
        {
            double tT,hT,bT;
            System.out.print("Enter top of trapezoid: ");
            tT=in.nextDouble();
            System.out.print("Enter bottom of trapezoid: ");
            bT=in.nextDouble();
            System.out.print("Enter height of trapezoid: ");
            hT=in.nextDouble();
            A=area(tT,bT,hT);
        }
        else if(choice==3)
        {
            double rC;
            System.out.print("Enter radius of circle: ");
            rC=in.nextDouble();
            A=area(rC);
        }
        else
        System.out.println("Invalid Choice");

        System.out.println("Area: "+A);
    }
}

