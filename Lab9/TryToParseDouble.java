import java.util.Scanner; public class TryToParseDouble
{
public static void main(String[] args)
{
Scanner in = new Scanner (System.in); System.out.print("Enter a number: "); String s = in.next();
Double value; try
{
value=Double.parseDouble(s);

}
catch(NumberFormatException obj)
{
System.out.println(obj+" cannot be converted into a number"); value=0.0;
}
System.out.println("Float Number: "+value);
}
}
