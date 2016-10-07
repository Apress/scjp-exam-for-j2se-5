
enum Colors {BLUE, GREEN,YELLOW, RED}
  class Picture {
    public static void main(String [] args) {
      int x = 0;
      Colors c = Colors.GREEN;
      switch(c) {
       case BLUE: 
          System.out.print(c);
       case GREEN: 
          System.out.print(c);
       case YELLOW: 
          System.out.print(c);
       default:
          System.out.print(" BlackWhite");
          break;
       case RED:
        System.out.print(c);   
      }
      System.out.println(" PiucturePerfect");
    }
 }



