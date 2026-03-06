package concurrency;

public class ThreadSynchronization extends Thread {

      static final Object lock = new Object();
      static int turn = 1;     // 1 = T1, 2 = T2

      private final int base;

      public ThreadSynchronization(String name, int base) {
            super(name);
            this.base = base;
      }

      @Override
      public void run() {
            for (int i = 1; i <= 10; i++) {
                  synchronized (lock) {
                        while (turn != base) {
                              try { lock.wait(); }
                              catch (InterruptedException e) { return; }
                        }
                        System.out.println(getName() + ": " + (base * i));
                        turn = (turn == 1) ? 2 : 1;
                        lock.notifyAll();
                  }
            }
      }

      public static void main(String[] args) {
            new ThreadSynchronization("T1", 1).start();
            new ThreadSynchronization("T2", 2).start();
      }
}
