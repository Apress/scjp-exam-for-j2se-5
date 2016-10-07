public class MyThreadTester {
  public static void main(String[] args) {
       Counter t1 = new Counter();
       Counter t2 = new Counter();

       t1.start();
       t2.start();
 }
}
class Counter extends Thread {
     void run() {
     System.out.println("Running");
 }
}