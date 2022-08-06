import java.util.Scanner;

class Patient
{
    int ID, age;
    int[] BloodData =new int[2];

    Patient()
    {
        ID=0;
        age=0;
        BloodData[0]=0;
        BloodData[1]=1;
    }

    Patient (int ID)
    {
        this.ID=ID;
    }

    Patient (int ID, int age)
    {
        this.ID=ID;
        this.age=age;
    }

    Patient (int ID, int age, int[] BloodData)
    {
        this.ID=ID;
        this.age=age;
        this.BloodData[0]=BloodData[0];
        this.BloodData[1]=BloodData[1];
    }

    void get (int ID)
    {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter ID: ");
        this.ID=in.nextInt();
    }

    void get (int ID, int age)
    {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter ID : ");
        this.ID=in.nextInt();
        System.out.print("Enter age: ");
        this.age=in.nextInt();
    }

    void get (int ID, int age, int[] BloodData)
    {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter ID : ");
        this.ID=in.nextInt();
        System.out.print("Enter age: ");
        this.age=in.nextInt();
        System.out.print("Enter Blood Data: ");
        this.BloodData[0]=in.nextInt();
        this.BloodData[1]=in.nextInt();
    }



    void print()
    {
        System.out.println("\nPatient Deatils");
        if(ID!=0)
        System.out.println("ID: "+ID);
        if(age!=0)
        System.out.println("Age: "+age);
        if(BloodData[0]!=0 && BloodData[1]!=0)
        System.out.println("Blood Data: "+BloodData[0]+"-"+BloodData[1]);
    }
}

public class TestPatient
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        int ch;
        while(true)
        {
            System.out.println("\n1.ID only  2.ID & age  3.ID, age & Blood Data  4.Exit");
            System.out.print("Enter your choice: ");
            ch=in.nextInt();
            if(ch==1)
            {
                Patient p=new Patient();
                p.get(p.ID);
                Patient p1=new Patient(p.ID);
                p1.print();
            }
            else if(ch==2)
            {
                Patient p=new Patient();
                p.get(p.ID, p.age);
                Patient p1=new Patient(p.ID, p.age);
                p1.print();
            }
            else if(ch==3)
            {
                Patient p=new Patient();
                p.get(p.ID, p.age, p.BloodData);
                Patient p1=new Patient(p.ID, p.age, p.BloodData);
                p1.print();
            }
            else if(ch==4)
            break;
        }
    }
}