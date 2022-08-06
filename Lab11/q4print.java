import java.util.Scanner;
import java.io.*;

class Record implements Serializable{
    private static final long serialVersionUID = 1L;
    int iNo;
    int q;
    Double price, total;

    Record(){};

    Record(int iNo, int q,Double price, Double total) 
    {
        this.iNo = iNo;
        this.q = q;
        this.price=price;
        this.total = total;
    }

    public String toString() 
    {
        return iNo + "\t" + q + "\t" + (total/q)+ "\t" + total;
    }
}

class InvalidItemNoException extends Exception {
    InvalidItemNoException(String s) {
        super(s);
    }
}

public class q4print {
    public static boolean isValid(int iNo, int[] I, int m) throws InvalidItemNoException {
        int flag = 0;
        for (int i = 0; i < m; i++) {
            if (iNo == I[i])
                flag = 1;
        }
        if (flag == 0)
            throw new InvalidItemNoException("Invalid Item No");
        else
            return true;
    }

    public static double price(int iNo, double[] p, int[] I, int m) {
        for (int i = 0; i < m; i++) {
            if (iNo == I[i])
                return p[i];
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int i, m = 5, iNo;
        int I[] = { 101, 105, 108, 115, 125 };
        double P[] = { 100.50, 175.95, 220.45, 280.75, 300.99 };

        String path = "C:\\java\\records.txt";
        FileOutputStream f = new FileOutputStream(path); 
        ObjectOutputStream o = new ObjectOutputStream(f);

        System.out.print("Enter no:of records: ");
        int n = in.nextInt();
        Record [] R = new Record[n];

        for (i = 0; i < n; i++) {
            try {
                System.out.print("\nEnter Item no: ");
                iNo = in.nextInt();
                if (isValid(iNo, I, m)) {
                    R[i]=new Record();
                    System.out.print("Enter quantity: ");
                    R[i].q=in.nextInt();
                    R[i].iNo=iNo;
                    R[i].price=price(iNo, P, I, m);
                    R[i].total=R[i].q*R[i].price;
                    o.writeObject(R[i]);
                    System.out.println("Record has been added!");
                }
            } catch (InvalidItemNoException e) {
                System.out.println("Exception Occured: " + e);
            }
        }

        FileInputStream fi = new FileInputStream(path); 
        ObjectInputStream oi = new ObjectInputStream(fi);
        System.out.println("Item No\tQty\tPrice\tTotal");
        Record [] R1 = new Record[5];
        for (i = 0; i < n; i++) {
            try{
                R1[i] = (Record) oi.readObject(); 
                System.out.println(R1[i].toString()); 
            }
            catch(Exception e){}
        }
    }
}
