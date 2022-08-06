import GokulJayan.Matrix;
import java.util.Scanner;
public class TestMatrix
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int n, i;
        Matrix m1 =new Matrix();
        m1.read();
        Matrix m2 =new Matrix();
        m2.read();

        System.out.println("\nMatrix-1:");
        m1.print();
        System.out.println("\nMatrix-2:");
        m2.print();
        
        Matrix m3=new Matrix();
        m3.add(m1,m2);
        System.out.println("\nSum:");
        m3.print();

        Matrix m4=new Matrix();
        m4.sub(m1,m2);
        System.out.println("\nDifference:");
        m4.print();
    }
}

