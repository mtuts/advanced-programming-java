package lab06.critical_section;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    Object obj = new Object();
    MyThread thread1 = new MyThread(obj);
    MyThread thread2 = new MyThread(obj);

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    System.out.printf("safe increment counter is %d\n", MyThread.counter);

    System.out.println("\n\nUnsafe thread increment!\n");
    MyThread t1 = new MyThread();
    MyThread t2 = new MyThread();

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.printf("unsafe increment counter is %d\n", MyThread.counter);
  }
}
