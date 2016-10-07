public class ThreadTest {
  public static void main(String[] args) {
       Counter ct = new Counter();
       ct.start();
       System.out.println("The thread has been started");
    }
}
class Counter extends Thread {
  public void run() {
    for ( int i=1; i<=5; i++) {
     System.out.println("Count: " + i);
    }
 }
}