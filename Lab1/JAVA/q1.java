import java.util.Scanner;

public class q1 
{
    public static void main(String[] args) 
    {
        float w, h, bmi;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your weight in kg: ");
        w = in.nextFloat();
        System.out.print("Enter your haight in meters: ");
        h = in.nextFloat();
        bmi = w / (h * h);
        System.out.println();
        System.out.println("Calculated BMI: " + bmi);

        System.out.print("Interpretation: ");
        if (bmi < 16)
            System.out.println("Serious underweight");
        else if (bmi < 18)
            System.out.println("Underweight");
        else if (bmi < 24)
            System.out.println("Normal weight");
        else if (bmi < 29)
            System.out.println("Overweight");
        else if (bmi < 35)
            System.out.println("Seriously overweight");
        else
            System.out.println("Gravely overweight");
    }
}