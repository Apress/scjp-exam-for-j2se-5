 class StaticExample {
   static int staticCounter=0;
            int  counter=0;
   StaticExample() {
          staticCounter++;
          counter++;
    }
 }
 class RunStaticExample {
    public static void main(String[] args) {
           StaticExample se1 = new StaticExample();
           StaticExample se2 = new StaticExample();
           System.out.println("Value of staticCounter for se1: " + se1.staticCounter);
           System.out.println("Value of staticCounter for se2: " + se2.staticCounter);
          System.out.println("Value of counter for se1: " + se1.counter);
          System.out.println("Value of counter for se2: " + se2.counter);
           
           StaticExample.staticCounter = 100;
           System.out.println("Value of staticCounter for se1: " + se1.staticCounter);
           System.out.println("Value of staticCounter for se2: " + se2.staticCounter);
    }
 }