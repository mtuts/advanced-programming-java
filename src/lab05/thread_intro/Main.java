package lab05.thread_intro;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    // 0 to 1000000
    long begin = System.currentTimeMillis();
    long sum = 0;
    for (int i = 0; i < 1000_000; i++) {
      sum += i;
    }
    long duration = System.currentTimeMillis() - begin;
    System.out.printf("main thread only: sum is %d, in %d millis\n", sum, duration);

    int num_of_threads = 2;
    MyThread[] myThreads = new MyThread[num_of_threads];
    Thread[] threads = new Thread[num_of_threads];
    int part = 1000_000 / num_of_threads;
    for (int i = 0; i < myThreads.length; ++i) {
      myThreads[i] = new MyThread(i, part);
      threads[i] = new Thread(myThreads[i]);
      threads[i].start();
    }

    begin = System.currentTimeMillis();
    sum = 0;
    for (int i = 0; i < myThreads.length; ++i ){
      threads[i].join();
      sum += myThreads[i].sum;
    }

    duration = System.currentTimeMillis() - begin;
    System.out.printf("%d threads: sum is %d, in %d millis\n", num_of_threads, sum, duration);
  }
}
