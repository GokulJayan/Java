public class q5
{
    public static void main(String[] args)
    {
        int max=0, maxDivisors=0, divisors;
        for(int j=1;j<=10000;j++)
        {
            divisors=0;
            for(int i=1;i<=j;i++)
            {
                if(j%i==0)
                divisors++;
            }
            if(divisors>maxDivisors)
            {
                max=j; 
                maxDivisors=divisors;  
            }         
        }
        
        System.out.println("Max Number: "+max);
        System.out.println("Max no:of Divisors: "+maxDivisors);
    }
}