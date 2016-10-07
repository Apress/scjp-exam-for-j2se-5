public class MultipleThreads {
  public static void main(String[] args) {
       System.out.println("The main thread of execution started");
       RunCounter rct1 = new RunCounter("First Thread");
       RunCounter rct2 = new RunCounter("Second Thread");
       RunCounter rct3 = new RunCounter("Third Thread");
      
    }
}
class RunCounter implements Runnable {
     Thread myThread;
  RunCounter(String name) {
     myThread = new Thread(this, name);
     myThread.start();
  }
  public void run() {
    for ( int i=1; i<=5; i++) {
     System.out.println("Thread: " + myThread.getName() + " Count: " + i);
    }
 }
}
