import java.util.Scanner;

class TaxPayer
{
    int SSN;
    float Inc;

    TaxPayer(int SSN, float Inc)
    {
        this.SSN=SSN;
        this.Inc=Inc;        
    }

    int getSSN()
    {
        return SSN;
    }

    float getInc()
    {
        return Inc;
    }

    void display()
    {
        System.out.println("SSN    : "+getSSN());
        System.out.println("Income : "+getInc());
    }
    
}

public class UseTaxPayer
{
    static int SNO=100000, count=1;
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n,i;
        float Income;
        System.out.print("\nEnter no: of tax payers: ");
        n=in.nextInt();
        TaxPayer T[]=new TaxPayer[n];

        for(i=0;i<n;i++)
        {
            System.out.print("Enter Yearly Gross Income of Tax payer-"+(count++)+": ");
            Income=in.nextFloat();  
            T[i]=new TaxPayer((SNO++),Income);
        }
        for(i=0;i<n;i++)
        {
            System.out.println("\nTax payer-"+(i+1));
            T[i].display();
        }
    }   
}
