package concurrency;

public class ThreadSleep extends Thread {

      @Override
      public void run () {
            String[] arr = {"A", "B", "C", "D"};
            for(String string : arr) {
                  System.out.println(string);
                  try {
                        currentThread().sleep(4000);
                  } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                  }
            }
      }
      public static void main(String[] args) {
            Thread thread = new Thread(new ThreadSleep());
            thread.start();
      }
}
