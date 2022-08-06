import java.util.Scanner;

public class q2 {

    public static int high (int[] temp, int n)
    {
        int i, max=temp[0];
        for(i=1;i<n;i++)
        {
            if(temp[i]>max)
            max=temp[i];
        }
        return max;
    }

    public static int low (int[] temp, int n)
    {
        int i, min=temp[0];
        for(i=1;i<n;i++)
        {
            if(temp[i]<min)
            min=temp[i];
        }
        return min;
    }  

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, i, j, d;
        
        System.out.print("Enter no: of cities: ");
        n=in.nextInt();
        
        System.out.print("Enter no: of testable days: ");
        d=in.nextInt();
        System.out.println();
        
        int[][] A = new int[n][d];
        for(i=0;i<n;i++)
        {
            System.out.print("Enter "+d+" days' temp of city-"+(i+1)+": ");
            for(j=0;j<d;j++)
            A[i][j]=in.nextInt();
        }
        System.out.println();
        for(i=0;i<n;i++)
        
        System.out.println("City-"+(i+1)+": High: "+high(A[i],d)+"  Low: "+low(A[i],d));
    }
}