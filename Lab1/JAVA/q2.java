import java.util.Scanner;

public class q2 {

    static int sum(int n) {
        int s = 0, d;
        while (n > 0) {
            d = n % 10;
            s += d;
            n = n / 10;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n = in.nextInt();
        System.out.println("Sum: " + sum(n));
    }
}