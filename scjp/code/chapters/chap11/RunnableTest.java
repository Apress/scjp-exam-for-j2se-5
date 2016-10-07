public class RunnableTest {
  public static void main(String[] args) {
       RunCounter rct = new RunCounter();
       Thread th = new Thread(rct);
       th.start();
       System.out.println("The thread has been started");
    }
}
class RunCounter extends Nothing implements Runnable {
  public void run() {
    for ( int i=1; i<=5; i++) {
     System.out.println("Count: " + i);
    }
 }
}
  class Nothing {
  }