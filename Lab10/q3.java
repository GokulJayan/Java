class Cart
{
      private int materials;
      private boolean available = false;
      public synchronized int get()
      {
            while (available == false)
            {
                  try
                  {
                        wait();
                  }
                  catch (InterruptedException ie)
                  {
                  }
            }
            available = false;
            notifyAll();
            return materials;
      }


      public synchronized void put(int value)
      {
            while (available == true)
            {
                  try
                  {
                        wait();
                  }
                  catch (InterruptedException ie)
                  {
                        ie.printStackTrace();
                  }
            }
            materials = value;
            available = true;
            notifyAll();
      }
}
class Consumer extends Thread
{
      private Cart Cart;
      private int number;
      public Consumer(Cart c, int number)
      {
            Cart = c;
            this.number = number;
      }
      public void run()
      {
            int value = 0;
            for (int i = 0; i < 5; i++)
            {
                  value = Cart.get();
                  System.out.println("Consumed "+ value);
            }
      }
}
class Producer extends Thread
{
      private Cart Cart;
      private int number;

      public Producer(Cart c, int number)
      {
            Cart = c;
            this.number = number;
      }
      public void run()
      {
            for (int i = 0; i < 5; i++)
            {
                  Cart.put(i);
                  System.out.println("Produced "+ i);
                  try
                  {
                        sleep((int)(Math.random() * 100));
                  }
                  catch (InterruptedException ie)
                  {
                        ie.printStackTrace();
                  }
            }
      }
}

public class q3
{
      public static void main(String[] args)
      {
            Cart c = new Cart();
            Producer p1 = new Producer(c, 1);
            Consumer c1 = new Consumer(c, 1);
            p1.start();
            c1.start();
      }
}