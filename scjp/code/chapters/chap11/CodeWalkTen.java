 
class CodeWalkTen {
  public static void main(String [] args) {
    Thread myThread = new Thread(new MyThreadClass(Thread.currentThread()));
    myThread.start();
    System.out.print("after_start ");
    myThread.run();
    System.out.print("Dead_thread ");
  } 
 }

class MyThreadClass implements Runnable {
    Thread mine;
  MyThreadClass(Thread mine) { this.mine = mine; }
    public void run() {
       System.out.print("In_run "); 
      } 
 }
 
