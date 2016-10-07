 class StaticExample {
   static int instanceCounter=0;
            int  counter=0;
   StaticExample() {
          instanceCounter++;
          counter++;
    }
 }
 class RunStaticExample {
    public static void main(String[] args) {
           StaticExample se1 = new StaticExample();
           StaticExample se2 = new StaticExample();
           System.out.println("Value of instanceCounter for se1: " + se1.instanceCounter);
           System.out.println("Value of instanceCounter for se2: " + se2.instanceCounter);
           System.out.println("Value of instanceCounter: " + StaticExample.instanceCounter);

          System.out.println("Value of counter for se1: " + se1.counter);
          System.out.println("Value of counter for se2: " + se2.counter);
           
           StaticExample.instanceCounter = 100;
           System.out.println("Value of instanceCounter for se1: " + se1.instanceCounter);
           System.out.println("Value of instanceCounter for se2: " + se2.instanceCounter);
    }
 }