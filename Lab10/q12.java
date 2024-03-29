import java.util.Random;

class Consumer extends Thread 
{
  private Buffer buffer;

  public Consumer(Buffer buffer) {
    this.buffer = buffer;
  }

  public void run() {
    int data;
    while (true) {
      data = buffer.consume();
    }
  }
}

class Producer extends Thread {
  private Buffer buffer;

  public Producer(Buffer buffer) {
    this.buffer = buffer;
  }

  public void run() {
    Random rand = new Random();
    while (true) {
      int n = rand.nextInt();
      buffer.produce(n);
    }
  }
}

class Buffer {
  private int data;
  private boolean empty;

  public Buffer() {
    this.empty = true;
  }

  public synchronized void produce(int newData) {
    while (!this.empty) {
      try {
        this.wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    this.data = newData;
    this.empty = false;
    this.notify();
    System.out.println("Produced:" + newData);
  }

  public synchronized int consume() {
    while (this.empty) {
      try {
        this.wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    this.empty = true;
    this.notify();
    System.out.println("Consumed:" + data);
    return data;
  }
}


public class q12 {
  public static void main(String[] args) {
    Buffer buffer = new Buffer();
    Producer p = new Producer(buffer);
    Consumer c = new Consumer(buffer);

    p.start();
    c.start();
  }
}