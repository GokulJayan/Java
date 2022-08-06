import java.util.Scanner;
import java.io.*;

public class q5 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int i, iNo, q;
        double price, totalPrice, total=0;

        String path = "C:\\java\\data.txt";
        InputStream is = new FileInputStream(path);
        DataInputStream dis = new DataInputStream(is);
 
        System.out.println("Item No\tQty\tPrice\tTotal");
        while(dis.available()>0){
            iNo = dis.readInt();
            q=dis.readInt();
            totalPrice=dis.readDouble();
            total+=totalPrice;
            price = totalPrice/q;
            System.out.println(iNo+"\t"+q+"\t"+price+"\t"+totalPrice);
        }

        System.out.println("\nGrand Total= "+total);
    }
}
