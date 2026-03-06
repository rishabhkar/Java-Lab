package concurrency;

public class ThreadLifecycle extends Thread {

      public static void main(String[] args) throws Exception {

            final Object lock = new Object();

            Thread t1 = new Thread(() -> {
               try {
                     Thread.sleep(2000);
               } catch (Exception e) { }
            });

            Thread t2 = new Thread(() -> {
               synchronized (lock) {
                     try {
                           lock.wait();
                     } catch (Exception e) { }
               }
            }, "Waiting thread");


            Thread t3 = new Thread(() -> {
                  synchronized (lock) {}
            }, "Blocked Thread");

            // New State
            System.out.println("New: " + t1.getState());

            // Runnable + Timed Waiting
            t1.start();
            Thread.sleep(100);
            System.out.println("T1 State:" + t1.getState());

            t2.start();
            Thread.sleep(100);
            System.out.println("T2 State:" + t2.getState());

            synchronized (lock) {
                  t3.start();
                  Thread.sleep(100);
                  System.out.println("T3 State:" + t3.getState());
            }

            t1.join();
            System.out.println("T1 State:" + t1.getState());
      }


}
