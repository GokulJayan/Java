class Divisors  
{
    int maxDivisors = 0, maxNumber=0;
    long startingTime, totalTime;

    class DivisorsThread extends Thread 
    {
        int startIndex, endIndex;
        DivisorsThread(int startIndex, int endIndex) 
        {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        public void run() 
        {
            int ThreadMaxDivisors = 0;
            int ThreadMaxNumber = 0;
            int divisors;
            for (int i = startIndex; i < endIndex; i++) 
            {
                divisors = 0;

                for (int j = 1; j <= i ; j++) 
                {
                    if (i%j == 0 )
                    divisors++;
                }
                
                if (divisors > ThreadMaxDivisors) 
                {
                    ThreadMaxDivisors = divisors;
                    ThreadMaxNumber = i;
                }
            }
            compare(ThreadMaxDivisors,ThreadMaxNumber);
        }
    }
    
    public void compare(int ThreadMaxDivisors, int ThreadMaxNumber) 
    {
        if (ThreadMaxDivisors > maxDivisors) 
        {
            maxDivisors = ThreadMaxDivisors;
            maxNumber = ThreadMaxNumber;
        }
    }
    
    public void countDivisors() 
    {
        int range =100000 ,noOfThreads=10;
        
        startingTime = System.currentTimeMillis();
        
        DivisorsThread[] threads = new DivisorsThread[noOfThreads];
        int n = range/noOfThreads; 
        int start = 1;  
        int end = start-1 + n;
        for (int i = 0; i < noOfThreads; i++) 
        {           
            threads[i] = new DivisorsThread(start, end);
            start = end+1; 
            end = start + n - 1;

            threads[i].start();

            // try 
            // {
            //     threads[i].join();
            // }
            // catch (Exception e) {}
        }

        for (int i = 0; i < noOfThreads; i++) 
        {
            try 
            {
                threads[i].join();
            }
            catch (Exception e) {}
        }

        totalTime = System.currentTimeMillis() - startingTime;
    }
}

public class q6
{
    public static void main(String[] args) 
    {
        Divisors d = new Divisors();
        d.countDivisors();
        System.out.println("Max Number: "+ d.maxNumber);
        System.out.println("Max no:of Divisors " + d.maxDivisors);
        System.out.println("Elapsed time:  " + (d.totalTime/1000.0) + " sec");
    }
}