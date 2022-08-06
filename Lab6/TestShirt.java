import java.util.Scanner;

class Shirt
{
    float collorSize, sleeveLen;
    String material;

    Shirt()
    {
        collorSize=0;
        sleeveLen=0;
        material="cotton";
    }

    Shirt(float collorSize, float sleeveLen, String material)
    {
        this.collorSize=collorSize;
        this.sleeveLen=sleeveLen;
        this.material=material;
    }

    void get (float collorSize, float sleeveLen)
    {
        Scanner in= new Scanner(System.in);
        System.out.print("\nEnter collor size : ");
        this.collorSize =in.nextFloat();
        System.out.print("Enter sleeve size: ");
        this.sleeveLen=in.nextFloat();
    }

    void get (float collorSize, float sleeveLen, String material)
    {
        Scanner in= new Scanner(System.in);
        System.out.print("\nEnter collor size : ");
        this.collorSize =in.nextFloat();
        System.out.print("Enter sleeve size: ");
        this.sleeveLen=in.nextFloat();
        System.out.print("Enter material: ");
        this.material=in.next();
    }

    void print()
    {
        System.out.println("Collor size   : "+collorSize);
        System.out.println("Sleeve length : "+sleeveLen);
        System.out.println("Material      : "+material);
    }
}

public class TestShirt
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        int ch;

        Shirt sh1=new Shirt();
        sh1.get(sh1.collorSize, sh1.sleeveLen, sh1.material);
        Shirt s1=new Shirt(sh1.collorSize,sh1.sleeveLen,sh1.material);

        Shirt sh2=new Shirt();
        sh2.get(sh2.collorSize, sh2.sleeveLen);
        Shirt s2=new Shirt(sh2.collorSize,sh2.sleeveLen,sh2.material);

        Shirt sh3=new Shirt();
        sh3.get(sh3.collorSize, sh3.sleeveLen, sh3.material);
        Shirt s3=new Shirt(sh3.collorSize,sh3.sleeveLen,sh3.material);

        System.out.println("\nShirt-1 Deatils");
        s1.print();
        System.out.println("\nShirt-2 Deatils");
        s2.print();
        System.out.println("\nShirt-3 Deatils");
        s3.print();

    }
}