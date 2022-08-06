import java.util.Scanner;

interface volume
{
    void innerVolume();
    void outerVolume();
}

class Part implements volume
{

    double s1, s2, s3, inVol, outVol;
    Part()
    {
        s1=0;
        s2=0;
        s3=0;
        inVol=0;
        outVol=0;
    }
    public void set()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side-1 measurement:");
        s1=in.nextDouble();
        System.out.print("Enter side-2 measurement:");
        s2=in.nextDouble();
        System.out.print("Enter side-3 measurement:");
        s3=in.nextDouble();
    }
    public void innerVolume()
    {
        inVol=(3.14*s1*s2*s3)/3;
    }
    public void outerVolume()
    {
        outVol=(4*3.14*s1*s2*s3)/3;
    }

    public void show()
    {
        System.out.println("\nPart: ");
        System.out.println("Side-1: "+s1);
        System.out.println("Side-2: "+s2);
        System.out.println("Side-3: "+s3);
        System.out.println("Inner Volume: "+inVol);
        System.out.println("Outer Volume: "+outVol);
    }
}

public class q1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Part p= new Part();
        p.set();
        p.innerVolume();
        p.outerVolume();
        p.show();
    }
}