 class Calculator {
   final int dime = 10;
   int count = 0;
   Calculator (int i) {
       count = i;
   }
 }
 class RunCalculator {   
   public static void main(String[] args) {
     final Calculator calc = new Calculator(1); 
  //      calc = new Calculator(2); // compiler error.
         calc.count = 2;  //ok
  //       calc.dime=11;   //compiler error 
      System.out.println("dime: " + calc.dime);
   }
  }