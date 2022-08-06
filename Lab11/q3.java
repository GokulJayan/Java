import java.util.Scanner;
import java.io.*;

class InvalidItemNoException extends Exception {
    InvalidItemNoException(String s) {
        super(s);
    }
}

public class q3 {
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
        int i, m = 5, iNo, q;
        int I[] = { 101, 105, 108, 115, 125 };
        double P[] = { 100.50, 175.95, 220.45, 280.75, 300.99 };

        String path = "C:\\java\\data.txt";
        OutputStream os = new FileOutputStream(path);
        DataOutputStream dos = new DataOutputStream(os);

        System.out.print("Enter no:of records: ");
        int n = in.nextInt();

        for (i = 0; i < n; i++) {
            try {
                System.out.print("\nEnter Item no: ");
                iNo = in.nextInt();
                if (isValid(iNo, I, m)) {
                    System.out.print("Enter quantity: ");
                    q = in.nextInt();
                    dos.writeInt(iNo);
                    dos.writeInt(q);
                    dos.writeDouble(q * price(iNo, P, I, m));
                    System.out.println("Record has been added!");
                }
            } catch (InvalidItemNoException e) {
                System.out.println("Exception Occured: " + e);
            }
        }
    }
}
