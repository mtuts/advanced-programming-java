package lab06.critical_section;

public class MyThread extends Thread {

  public static long counter = 0;
  private final Object obj;

  public MyThread() {
    this.obj = null;
    counter = 0;  // reset counter
  }

  public MyThread(Object obj) {
    this.obj = obj;
    counter = 0;  // reset counter
  }

  @Override
  public void run() {
    for (int i = 0; i < 1000_000; i++) {
      if (obj == null) {
        unsafe_inc();
      } else {
        inc();
      }
    }
    System.out.println(getName() + " is finished");
  }

  private void unsafe_inc() {
    counter++;
  }

  private void inc() {
    synchronized (obj) {
      counter++;
    }
  }
}