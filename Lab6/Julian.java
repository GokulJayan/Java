import java.util.Scanner;

class Julian
{
    long day;
    int noOfDay;
    String nameOfDay;

    Julian (long day)
    {
        this.day=day;
    }

    void findDay()
    {
        noOfDay=(int) (this.day+1)%7; 
        String[] names={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        nameOfDay=names[noOfDay];
    } 

    void print()
    {
        System.out.println("Julian day number "+day+" is a "+nameOfDay+".");
    }

    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a Julian day number and press Enter.");
        long d=in.nextLong();
        Julian j=new Julian(d);
        j.findDay();
        j.print();
    }
}