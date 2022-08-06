import java.util.Scanner;
import java.io.*;

public class q3print {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int i, iNo, q;
        double price, total;

        String path = "C:\\java\\data.txt";
        InputStream is = new FileInputStream(path);
        DataInputStream dis = new DataInputStream(is);
 
        System.out.println("Item No\tQty\tPrice\tTotal");
        while(dis.available()>0){
            iNo = dis.readInt();
            q=dis.readInt();
            total=dis.readDouble();
            price = total/q;
            System.out.println(iNo+"\t"+q+"\t"+price+"\t"+total);
        }
    }
}
