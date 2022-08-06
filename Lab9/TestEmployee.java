import java.util.Scanner;

class InvalidECodeException extends Exception
{
    InvalidECodeException(String msg)
    {
        super(msg);
    }
}

class InvalidDOAException extends Exception
{
    InvalidDOAException(String msg)
    {
        super(msg);
    }
}
class Employee
{
    static String ecode, name, dob, doa;

    Employee(String ecode, String name, String dob, String doa)
    {
        this.ecode=ecode;
        this.name=name;
        this.dob=dob;
        this.doa=doa;
    }
}

public class TestEmployee 
{
    public static boolean isNumber(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
            return true;
        }
        return false;
    }

    public static boolean isAlpha(char c)
    {
        if(c=='M' || c=='A' || c=='H' || c=='E' || c=='T')
        return true;
        else
        return false;
    }

    public static boolean isValid(String ecode) throws InvalidECodeException
    {
        if (ecode.length()==8)
        {
            if(isNumber(ecode.substring(0,2)) && isAlpha(ecode.charAt(3)) && isNumber(ecode.substring(5,8)))
            return true;
            else
            throw new InvalidECodeException("Invalid employee code");
        }
        else
        throw new InvalidECodeException("Invalid employee code");
    }

    public static boolean isBefore(String dob, String doa) throws InvalidDOAException
    {
        if (Integer.valueOf(dob.substring(6,10))<Integer.valueOf(doa.substring(6,10)))
        return true;
        else if(Integer.valueOf(dob.substring(6,10))>Integer.valueOf(doa.substring(6,10)))
        throw new InvalidDOAException("DOB is not before DOA");
        else
        {
            if(Integer.valueOf(dob.substring(3,5))<Integer.valueOf(doa.substring(3,5))) 
            return true;
            else if(Integer.valueOf(dob.substring(3,5))>Integer.valueOf(doa.substring(3,5))) 
            throw new InvalidDOAException("DOB is not before DOA");
            else
            {
                if(Integer.valueOf(dob.substring(0,2))<Integer.valueOf(doa.substring(0,2))) 
                return true;
                else
                throw new InvalidDOAException("DOB is not before DOA");
            }
        }    
    }


    public static void main(String[] args)
    {
        String ecode, name, dob, doa;
        // ecode="55-A-625";
        // name="Christy";
        // dob="05-10-2020";
        // doa="06-11-2019";
        Scanner in = new Scanner(System.in);
        int count=0, i;
        System.out.print("Enter no:of employees: ");
        int n=in.nextInt();
        Employee[] e= new Employee[n];

        for(i=0;i<n;i++)
        {
            System.out.print("\nEnter ecode: ");
            ecode=in.next();
            System.out.print("Enter name : ");
            name=in.next();

            System.out.print("Enter dob  : ");
            dob=in.next();
            System.out.print("Enter doa  : ");
            doa=in.next();

            try  
            { 
                if(isValid(ecode) && isBefore(dob,doa))
                {
                    e[count]=new Employee(ecode, name, dob, doa);
                    count++;
                }
            }  
            catch (InvalidECodeException e1)  
            { 
                System.out.println("Exception occured: " + e1);  
            }    

            catch (InvalidDOAException e2)  
            {
                System.out.println("Exception occured: " + e2);  
            }  

        }
        
        System.out.println("\nNo: of valid Employees: "+count);
        for(i=0;i<count;i++)
        {
            System.out.println("\nEmployee-"+(i+1)+": ");
            System.out.println("Ecode: "+e[i].ecode);
            System.out.println("Name : "+e[i].name);
            System.out.println("DOB  : "+e[i].dob);
            System.out.println("DOA  : "+e[i].doa);
        }
    }    
}