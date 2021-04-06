package lab05.thread_intro;

public class MyThread  implements Runnable {

  private int id;
  private int part;
  public long sum;

  public MyThread(int id, int part) {
    this.id = id;
    this.part = part;
    sum = 0;
  }

  @Override
  public void run() {
    for (int i = 0; i < part; i++) {
      sum += i + (long) part * id;
    }
  }
}
