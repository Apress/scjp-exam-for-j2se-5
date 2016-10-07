public class MyThreads {
  public static void main(String[] args) {
       Thread t1 = new Counter();
       Thread t2 = new Thread(t1);
       t1.start();
       t2.start();
 }
}
class Counter extends Thread implements Runnable {
  public void run() {
     System.out.println("Running");
 }
}