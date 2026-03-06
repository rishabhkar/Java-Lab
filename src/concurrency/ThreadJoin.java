package concurrency;

import static java.lang.Thread.currentThread;

public class ThreadJoin implements Runnable {

      @Override
      public void run() {

            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            for (int val : arr) {
                  try {
                        System.out.println(val);
                        currentThread().sleep(2000);
                  } catch (Exception e) {
                  }
            }

      }

      public static void main(String[] args) {
            int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1};
            Thread t1 = new Thread(new ThreadJoin());
            t1.start();
            for (int val : arr) {
                  try {
                        System.out.println(val);
                        Thread.sleep(100);
                        t1.join();
                  } catch (Exception e) {
                  }
            }
      }

}
