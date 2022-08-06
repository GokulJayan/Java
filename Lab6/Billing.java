import java.util.Scanner;

class Billing
{
    float price, q, cvalue, total;

    Billing (float price)
    {
        this.price=price;
    }

    Billing (float price, float q)
    {
        this.price=price;
        this.q=q;
    }

    Billing (float price, float q, float cvalue)
    {
        this.price=price;
        this.q=q;
        this.cvalue=cvalue;
    }

    float computeBill(float price)
    {
        total=price+(8*price)/100;        
        return total;
    } 

    float computeBill(float price, float q)
    {
        total=q*price+(8*q*price)/100;        
        return total;
    } 

    float computeBill(float price, float q, float cvalue)
    {
        total=q*price-cvalue+(8*(q*price-cvalue))/100;        
        return total;
    } 

    void print()
    {
        System.out.println("Total: "+total);
    }

    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        int ch;
        while(true)
        {
            System.out.println("\n1.Single  2.Double  3.Triple  4.Exit");
            System.out.print("Enter your choice:: ");
            ch=in.nextInt();
            if(ch==1)
            {
                System.out.print("Enter price of one photo book: ");
                Float p=in.nextFloat();
                Billing b=new Billing(p);
                b.total=b.computeBill(p);
                b.print();
            }
            else if(ch==2)
            {
                System.out.print("Enter price of one photo book: ");
                Float p=in.nextFloat();
                System.out.print("Enter quantity: ");
                Float q=in.nextFloat();
                Billing b=new Billing(p,q);
                b.total=b.computeBill(p,q);
                b.print();
            }
            else if(ch==3)
            {
                System.out.print("Enter price of one photo book: ");
                Float p=in.nextFloat();
                System.out.print("Enter quantity: ");
                Float q=in.nextFloat();
                System.out.print("Enter coupon value: ");
                Float c=in.nextFloat();
                Billing b=new Billing(p,q,c);
                b.total=b.computeBill(p,q,c);
                b.print();
            }
            else if(ch==4)
            break;
        }
    }
}