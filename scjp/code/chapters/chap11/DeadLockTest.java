public class DeadLockTest {
  public static void main(String[] args) {
       Object obj1 = "objectA";
       Object obj2 = "objectB";
       DeadLock t1 = new DeadLock(obj1, obj2);
       DeadLock t2 = new DeadLock(obj2, obj1);
       t1.start();
       t2.start();
       System.out.println("The threads have been started");
    }
}
class DeadLock extends Thread {
  private Object resourceA;
  private Object resourceB;
 public DeadLock(Object a, Object b){
   resourceA = a;
   resourceB = b;
 }  
 public void run() {
    while (true) {
     
     System.out.println("The thread " + Thread.currentThread().getName() + " waiting for a lock on " + resourceA);
     synchronized (resourceA){
      System.out.println("The thread " + Thread.currentThread().getName() + " received a lock on " + resourceA); 
      System.out.println("The thread " + Thread.currentThread().getName() + " waiting for a lock on " + resourceB);
        synchronized (resourceB){
          System.out.println("The thread " + Thread.currentThread().getName() + " received a lock on " + resourceB);
           try{
            Thread.sleep(500);
           }catch (Exception e){} 
        }
     }
    }
  }
 }