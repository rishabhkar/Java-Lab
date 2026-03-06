package concurrency;

public class ThreadsViaRunnable implements Runnable {

      @Override
      public void run() {
            System.out.println("Hello. I am thread");
      }

      public static void main(String[] args) {

            Thread thread = new Thread(new ThreadsViaRunnable());
            thread.start();
      }

}
