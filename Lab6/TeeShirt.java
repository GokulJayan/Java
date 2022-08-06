import java.util.Scanner;

class TeeShirt
{
    int oNO;
    double price;
    String size, color;

    void setDetails()
    {
        Scanner in= new Scanner(System.in);
        System.out.print("\nEnter order no: ");
        oNO =in.nextInt();
        System.out.print("Enter size: ");
        size=in.next();
        System.out.print("Enter color: ");
        color=in.next();
        setPrice();
    }

    void setPrice()
    {
        if(size.equals("XXL") || size.equals("XXXL"))
        price=22.99;
        else   
        price=19.99;
    }

    int getoNO()
    {
        return oNO;
    }

    double getprice()
    {
        return price;
    }

    String getsize()
    {
        return size;
    }

    String getcolor()
    {
        return color;
    }

    void printDetails()
    {
        System.out.println("Order No : "+getoNO());
        System.out.println("Size     : "+getsize());
        System.out.println("Color    : "+getcolor());
        System.out.println("Price    : "+getprice());
    }

    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        int ch;

        CustomTee s1=new CustomTee();
        s1.set();
        CustomTee s2=new CustomTee();
        s2.set();
        System.out.println("\nTee Shirt-1 Deatils");
        s1.print();
        System.out.println("\nTee Shirt-2 Deatils");
        s2.print();
    }
}

class CustomTee extends TeeShirt
{
    String slogan;
    void set()
    {
        setDetails();
        Scanner in= new Scanner(System.in);
        System.out.print("Enter Slogan: ");
        slogan=in.nextLine();
    }

    String getslogan()
    {
        return slogan;
    }

    void print()
    {
        printDetails();
        System.out.println("Slogan   : "+getslogan());
    }
}