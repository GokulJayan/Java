class counterClass 
{
   public static int sharedInt=0;
   synchronized void count()
   {
      for(int i=0; i<10000; i++)
      sharedInt++;
   }
}

class MyThread extends Thread
{
   counterClass c;
   MyThread(counterClass c)
   {
      this.c = c;
      start();
      try
      {
          join();
      }catch(Exception e){}
   } 
   public void run()
   {
       c.count();    
   }
}

public class q2
{  
   public static void main(String[] args)
   {
      counterClass c = new counterClass();
      MyThread t1 = new MyThread(c);     
      MyThread t2 = new MyThread(c);     
      System.out.println("Result: "+c.sharedInt);
   }
}
