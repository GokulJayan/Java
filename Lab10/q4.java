class Counter
{
    int count=0;

    public void increment() 
    {
        count++;
    }

    public void decrement() 
    {
        count--;
    }
}

class CounterThread extends Thread
{
    Counter c = new Counter();
    CounterThread(Counter c)
    {
        this.c=c;
        start();
    }   

    public void run() 
    {
        c.increment();
        System.out.println(Thread.currentThread().getName() + ": Beg value: "+ c.count);
        c.decrement();
        System.out.println(Thread.currentThread().getName() + ": End value: " +c.count);
    }
}

public class q4 
{
    public static void main(String args[]) 
    {
        Counter c = new Counter();
        CounterThread t1 = new CounterThread(c);
        CounterThread t2 = new CounterThread(c);
        CounterThread t3 = new CounterThread(c);
    }
}



    