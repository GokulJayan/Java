package GokulJayan;
import java.util.Scanner;

public class Matrix
{
    Scanner in = new Scanner(System.in);
    int row, col;
    int i,j;
    int[][] ele;
    public void read() 
    {
        System.out.print("\nEnter row size: ");
        row=in.nextInt();
        System.out.print("Enter col size: ");
        col=in.nextInt();
        ele=new int[row][col];
        System.out.println("Enter matrix elements: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            ele[i][j]=in.nextInt();                                            
        }
    }
    public void print() 
    {
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            System.out.print(ele[i][j]+" ");
            System.out.println();                                            
        }
    }

    public void add(Matrix M1, Matrix M2)
    {
        if(M1.row==M2.row && M2.col==M2.col)
        {
            row=M1.row;
            col=M1.col;
            ele=new int[row][col];
            int i,j;
            for(i=0;i<row;i++)
            {
                for(j=0;j<col;j++)
                ele[i][j]=M1.ele[i][j]+M2.ele[i][j];                                        
            }
        }
    }

    public void sub(Matrix M1, Matrix M2)
    {
        if(M1.row==M2.row && M2.col==M2.col)
        {
            row=M1.row;
            col=M1.col;
            ele=new int[row][col];
            int i,j;
            for(i=0;i<row;i++)
            {
                for(j=0;j<col;j++)
                ele[i][j]=M1.ele[i][j]-M2.ele[i][j];                                        
            }
        }
    }
}