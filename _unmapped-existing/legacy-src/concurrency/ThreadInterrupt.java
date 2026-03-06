package concurrency;

public class ThreadInterrupt extends Thread {

      @Override
      public void run() {

            int i = 0;
            while (i < 100 && !currentThread().isInterrupted()) {
                  try {
                        currentThread().sleep(200);
                        System.out.println(i);
                        i++;
                  } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                  }
            }
            System.out.println("Thread Interrupted");
      }

      public static void main(String[] args) throws Exception {

            Thread thread = new ThreadInterrupt();
            thread.start();
            Thread.sleep(3000);
            thread.interrupt();
            thread.join();
      }

}
