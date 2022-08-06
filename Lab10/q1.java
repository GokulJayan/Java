class MyThread extends Thread
{
   public void run()
   {
      System.out.println(currentThread().getName()+ " Hello world" );    
   }
}

public class q1
{
   public static void main(String[] args)
   {
      MyThread[] t = new MyThread[5];
      
      for(int i=0;i<5;i++)
      {
         t[i]=new MyThread();
         t[i].setName("T"+i);
         t[i].start();
      }
      
      // MyThread t1 = new MyThread();     
      // t1.start();
      // MyThread t2 = new MyThread();     
      // t2.start();
      // MyThread t3 = new MyThread();     
      // t3.start();
      // MyThread t4 = new MyThread();     
      // t4.start();
      // MyThread t5 = new MyThread();     
      // t5.start();
   }
}
