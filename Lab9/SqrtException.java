import java.util.Scanner; public class SqrtException
{
public static void main(String[] args)
{
Scanner in = new Scanner (System.in); System.out.print("Enter a number: "); double n= in.nextInt();
try
{
if(n<0)
throw new ArithmeticException("Negative value is not allowed for square root calculation"); else
System.out.println("Square root of "+n+": "+Math.sqrt(n));
}
catch(ArithmeticException a)
{
System.out.println(a);
}
}
}


