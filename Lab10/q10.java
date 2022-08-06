class MyThread extends Thread
{
    int maxN=0, maxDivisors=0, divisors;
    MyThread()
    {
        start();
        try
        {
            join();
        }catch(Exception e){}
    } 

    public void run()
    {
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
                maxN=j; 
                maxDivisors=divisors;  
            }         
        }                  
    }
}

public class q10
{
    public static void main(String[] args)
    {
        MyThread t = new MyThread();         
        System.out.println("Max Number: "+t.maxN);
        System.out.println("Max no:of Divisors: "+t.maxDivisors);

    }
}
