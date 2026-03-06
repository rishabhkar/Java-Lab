package concurrency;

public class ThreadsViaThreadClass extends Thread {

      @Override
      public void run() {
            System.out.println("Thread class here");
      }

      public static void main(String[] args) {

            Thread thread = new Thread(new ThreadsViaThreadClass());
            thread.start();
      }
}
