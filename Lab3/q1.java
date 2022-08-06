import java.util.Scanner;
import java.lang.Math;

public class q1 
{
    public static void main(String args[]) 
    {
        int choice;
        Scanner in = new Scanner(System.in);

        while (true) 
        {
            System.out.println("1.Arithmetic   2.Logarithmic   3.Trigonometric   4.Converter   5.Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            if (choice == 1) 
            {
                System.out.println("1.Add   2.Sub   3.Mul   4.Div");
                System.out.print("Enter your choice: ");
                choice = in.nextInt();
                System.out.print("Enter two nos: ");
                int a = in.nextInt();
                int b = in.nextInt();
                switch (choice) 
                {
                    case 1:
                        System.out.println("Sum: " + a + "+" + b + " = " + (a + b));
                        break;

                    case 2:
                        System.out.println("Difference: " + a + "-" + b + " = " + (a - b));
                        break;

                    case 3:
                        System.out.println("Product: " + a + "*" + b + " = " + (a * b));
                        break;

                    case 4:
                        System.out.println("Quotient: " + a + "/" + b + " = " + (float) a / b);
                        break;

                    default:
                        System.out.println("Invalid Input");
                        break;

                }
            }

            else if(choice==2)
            {
                System.out.println("1.Natural Log   2.Log   3.Natural Antilog   4.Antilog");
                System.out.print("Enter your choice: ");
                choice = in.nextInt();

                double n,result,base, e=2.718281828459045;
                switch (choice) 
                {
                    case 1:
                        System.out.print("Enter number: ");
                        n = in.nextDouble();
                        result=Math.log(n) / Math.log(e);
                        result = Math.round(result*Math.pow(10,9))/Math.pow(10,9);
                        System.out.println("Natural Log("+n+"): " + (result));
                        break;

                    case 2:
                        System.out.print("Enter base: ");
                        base = in.nextDouble();
                        System.out.print("Enter number: ");
                        n = in.nextDouble();
                        result=Math.log(n) / Math.log(base);
                        result = Math.round(result*Math.pow(10,9))/Math.pow(10,9);
                        System.out.println("Log("+n+") with base "+base+" = " + (result));
                        break;

                    case 3:
                        System.out.print("Enter number: ");
                        n = in.nextDouble();
                        result= Math.pow(e,n);
                        result = Math.round(result*Math.pow(10,6))/Math.pow(10,6);
                        System.out.println("Natural Antilog: e^("+n+") = " + (result));
                        break;

                    case 4:
                        System.out.print("Enter base: ");
                        base = in.nextDouble();
                        System.out.print("Enter number: ");
                        n = in.nextDouble();
                        result=Math.pow(base,n);
                        result = Math.round(result*Math.pow(10,6))/Math.pow(10,6);
                        System.out.println("Antilog: "+base+"^("+n+") = " + (result));
                        break;

                    default:
                        System.out.println("Invalid Input");
                        break;

                }
            }

            else if(choice==3)
            {
                System.out.println("1.Sin   2.Cos   3.Tan   4.Sin_Inverse   5.Cos_Inverse   6.Tan_Inverse");
                System.out.print("Enter your choice: ");
                choice = in.nextInt();

                double result,n,m;
                switch (choice) 
                {
                    case 1:
                        System.out.print("Enter Angle in Degrees: ");
                        n = in.nextDouble();
                        m = Math.toRadians(n);
                        result=Math.sin(m);
                        result = Math.round(result*Math.pow(10,9))/Math.pow(10,9);
                        System.out.println("Sin("+n+") = " + (result));
                        break;
                    
                    case 2:
                        System.out.print("Enter Angle in Degrees: ");
                        n = in.nextDouble();
                        m = Math.toRadians(n);
                        result=Math.cos(m);
                        result = Math.round(result*Math.pow(10,9))/Math.pow(10,9);
                        System.out.println("Cos("+n+") = " + (result));
                        break;

                    case 3:
                        System.out.print("Enter Angle in Degrees: ");
                        n = in.nextDouble();
                        m = Math.toRadians(n);
                        result=Math.tan(m);
                        result = Math.round(result*Math.pow(10,9))/Math.pow(10,9);
                        System.out.println("Tan("+n+") = " + (result));
                        break;

                    case 4:
                        System.out.print("Enter value: ");
                        n = in.nextDouble();
                        result=Math.asin(n);
                        result = Math.toDegrees(result);
                        result = Math.round(result*Math.pow(10,9))/Math.pow(10,9);
                        System.out.println("Sin_Inv("+n+") = " + (result));
                        break;
                    
                    case 5:
                        System.out.print("Enter value: ");
                        n = in.nextDouble();
                        result=Math.acos(n);
                        result = Math.toDegrees(result);
                        result = Math.round(result*Math.pow(10,9))/Math.pow(10,9);
                        System.out.println("Cos_Inv("+n+") = " + (result));
                        break;
                    
                    case 6:
                        System.out.print("Enter value: ");
                        n = in.nextDouble();
                        result=Math.atan(n);
                        result = Math.toDegrees(result);
                        result = Math.round(result*Math.pow(10,9))/Math.pow(10,9);
                        System.out.println("Tan_Inv("+n+") = " + (result));
                        break;

                    default:
                        System.out.println("Invalid Input");
                        break;

                }
            }

            else if(choice==4)
            {
                System.out.println("1.Length   2.Weight   3.Temperature");
                System.out.print("Enter your choice: ");
                choice = in.nextInt();
                double result;
                switch (choice) 
                {
                    case 1:
                        double length;
                        System.out.println("1.m to km   2.m to cm   3.cm to km   4.km to cm");
                        System.out.print("Enter your choice: ");
                        choice = in.nextInt();
                        switch(choice)
                        {
                            case 1:
                                System.out.print("Enter length in meter: ");
                                length=in.nextDouble();
                                result=length/1000;
                                System.out.println("Converted Length:" + (result)+"km");
                                break;

                            case 2:
                                System.out.print("Enter length in meter: ");
                                length=in.nextDouble();
                                result=length*100;
                                System.out.println("Converted Length:" + (result)+"cm");
                                break;
                            
                            case 3:
                                System.out.print("Enter length in cm: ");
                                length=in.nextDouble();
                                result=(length/100)/1000;
                                System.out.println("Converted Length:" + (result)+"km");
                                break;

                            case 4:
                                System.out.print("Enter length in km: ");
                                length=in.nextDouble();
                                result=length*100*1000;
                                System.out.println("Converted Length:" + (result)+"cm");
                                break;
                            default:
                                System.out.println("Invalid Input");
                                break;
                        }
                        break;

                        case 2:
                        double weight;
                        System.out.println("1.g to kg   2.g to mg   3.mg to kg   4.kg to mg");
                        System.out.print("Enter your choice: ");
                        choice = in.nextInt();
                        switch(choice)
                        {
                            case 1:
                                System.out.print("Enter weight in g: ");
                                weight=in.nextDouble();
                                result=weight/1000;
                                System.out.println("Converted weight:" + (result)+"kg");
                                break;

                            case 2:
                                System.out.print("Enter weight in g: ");
                                weight=in.nextDouble();
                                result=weight*1000;
                                System.out.println("Converted weight:" + (result)+"mg");
                                break;
                            
                            case 3:
                                System.out.print("Enter weight in mg: ");
                                weight=in.nextDouble();
                                result=(weight/1000)/1000;
                                System.out.println("Converted weight:" + (result)+"kg");
                                break;

                            case 4:
                                System.out.print("Enter weight in kg: ");
                                weight=in.nextDouble();
                                result=weight*1000*1000;
                                System.out.println("Converted weight:" + (result)+"mg");
                                break;
                            default:
                                System.out.println("Invalid Input");
                                break;
                        }
                        break;

                        case 3:
                        double temp;
                        System.out.println("1.celsius to fahrenheit   2.celsius to kelvin");
                        System.out.println("3.fahrenheit to celsius   4.fahreheit to kelvin");
                        System.out.println("5.kelvin to celsius       6.kelvin to fahrenheit");
                        System.out.print("Enter your choice: ");
                        choice = in.nextInt();
                        switch(choice)
                        {
                            case 1:
                                System.out.print("Enter temperature in celsius: ");
                                temp=in.nextDouble();
                                result=(((double)9/5)*temp)+32;
                                result = Math.round(result*Math.pow(10,2))/Math.pow(10,2);
                                System.out.println("Converted Temperature:" + (result)+" deg F");
                                break;
                            
                            case 2:
                                System.out.print("Enter temperature in celsius: ");
                                temp=in.nextDouble();
                                result=temp+273.15;
                                result = Math.round(result*Math.pow(10,2))/Math.pow(10,2);
                                System.out.println("Converted Temperature:" + (result)+" Kelvin");
                                break;
                            
                            case 3:
                                System.out.print("Enter temperature in fahrenheit: ");
                                temp=in.nextDouble();
                                result=(temp-32)*(double)5/9;
                                result = Math.round(result*Math.pow(10,2))/Math.pow(10,2);
                                System.out.println("Converted Temperature:" + (result)+" deg C");
                                break;

                            case 4:
                                System.out.print("Enter temperature in fahrenheit: ");
                                temp=in.nextDouble();
                                result=((temp-32)*(double)5/9)+273.15;
                                result = Math.round(result*Math.pow(10,2))/Math.pow(10,2);
                                System.out.println("Converted Temperature:" + (result)+" Kelvin");
                                break;

                            case 5:
                                System.out.print("Enter temperature in kelvin: ");
                                temp=in.nextDouble();
                                result=temp-273.15;
                                result = Math.round(result*Math.pow(10,2))/Math.pow(10,2);
                                System.out.println("Converted Temperature:" + (result)+" deg C");
                                break;

                            case 6:
                                System.out.print("Enter temperature in kelvin: ");
                                temp=in.nextDouble();
                                result=((temp-273.15)*(double)9/5+32);
                                result = Math.round(result*Math.pow(10,2))/Math.pow(10,2);
                                System.out.println("Converted Temperature:" + (result)+" deg F");
                                break;

                            default:
                                System.out.println("Invalid Input");
                                break;
                        }
                        break;


                    default:
                        System.out.println("Invalid Input");
                        break;
                }
            }

            else if(choice==5)
            break;

            System.out.println();
            System.out.println();
        }
    }
}
