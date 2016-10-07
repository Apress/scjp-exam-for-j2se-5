public class PrintMyStuff {
  public static void main(String[] args) {
       Thread t = new Counter();
       t.start();
       System.out.print(" Started");
       finally {
           System.out.print(" Finally");
       }       
 }
}
class Counter extends Thread implements Runnable {
  public void run() {
     try{
          Thread.sleep(3000);
        }catch (Exception ex) {}
     System.out.print(" Running");
 }
}
