import java.util.Scanner;
import java.io.*;

public class q1 {
    public static void main(String[] args) throws IOException {
        String path = "/home/student/java/abc.txt";
        File f = new File(path);
        if (f.createNewFile())
            System.out.println("File has been created successfully!");
        else
            System.out.println("File is not created!");
    }
}
