public class TestCouponMachine {
  public static void main(String[] args) {
   //create the coupon machine.
     CouponMachine cm = new CouponMachine();
     Consumer[] con = new Consumer[5];
     
     for (int i=0; i<5; i++) {
         con[i] = new Consumer(cm);
         con[i].start();
     }
        Producer prod = new Producer(cm);
         prod.start();
           System.out.println("The main thread: All threads have been launched!");
    }
}
class Producer extends Thread {
   int count =0;
   CouponMachine cpm;
   Producer(CouponMachine cpm) {
     this.cpm = cpm;
   }
 public void run() {
    for (int i=0; i<5; i++){
    cpm.createCoupon(++count);
    System.out.println("Coupon produced: " + count);
   }
 }
}

class Consumer extends Thread {
   int count;
   CouponMachine cpm;
   Consumer (CouponMachine cpm) {
     this.cpm = cpm;
   }
 public void run() {
    count=cpm.consumeCoupon();
    System.out.println("Coupon consumed: " + count);
 }
}

class CouponMachine {
 private int couponID;
 private boolean  couponExists =  false;

public synchronized void createCoupon(int coup) {
  while(couponExists) {
    try {
         wait();
    } catch (Exception e) {
       System.out.println("Exception: " + e);
    }
   }
       this.couponID =  coup;
       couponExists = true;
       notify();
}

public synchronized int consumeCoupon() {
  while(!couponExists) {
    try {
         wait();
    } catch (Exception e) {
       System.out.println("Exception: " + e);
    }
   }
       couponExists = false;
       notify();
       return couponID;
 }
}