import java.util.Scanner;
import java.io.*;

public class q2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int i;

        System.out.print("Enter no:of characters: ");
        int n = in.nextInt();
        char ch;

        String path = "/home/student/java/abc.txt";
        File f = new File(path);
        if (f.exists()) {
            FileWriter fw = new FileWriter(path);
            for (i = 0; i < n; i++) {
                System.out.print("Enter character " + (i + 1) + ": ");
                ch = in.next().charAt(0);
                fw.write(Character.toUpperCase(ch) + "\n");
            }
            System.out.println("All " + n + " characters have been written to the file!");
            fw.close();
        } else
            System.out.println("File is not found!");
    }
}
