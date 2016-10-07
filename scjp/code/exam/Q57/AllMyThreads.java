public class AllMyThreads {
  public static void main(String[] args) {
       Thread t = new Counter();
       t.start();
       System.out.print(" Started");
       try{
       t.join();
       } catch (Exception ex){}
       System.out.print(" Main");

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