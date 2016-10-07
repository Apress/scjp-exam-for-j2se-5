
 class CodeWalkFour {
  public static void main(String[] args){
      Car c = new Lexus();
      System.out.print(c.speedUp(30) + " ");
      Lexus l = new Lexus();
      System.out.print(l.speedUp(30, 40, 50));
  }
 }

  class Car {
   private int i=0;
   int speedUp(int x){
       return i;
   }
  }
 class Lexus extends Car {
   private int j = 1;
   private int k = 2;
   int speedUp(int y){
      return j;
   }
   int speedUp(int... z){
      return k;
   }
  }