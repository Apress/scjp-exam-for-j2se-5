public class MyThread {
  public static void main(String[] args) {
       Counter ct = new Counter();
       Counter ct1 = new Counter(Runnable);
       ct.run();
       ct.start();
       ct.run();
 }
}
class Counter extends Thread {
  public void run() {
     System.out.println("Running");
 }
}