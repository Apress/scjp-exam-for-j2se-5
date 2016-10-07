import java.io.PrintWriter;
  class CodeWalkEight{
    public static void main(String [] args) {
      TheBooleanGame bg = new TheBooleanGame();
      bg.printBoolean();
    }
   }

   class TheBooleanGame {

    public void printBoolean(){
      String s1 = "1";
      String s2 = "0";
      String s3 = "null";
      String s4 = "True";
      String s5 = null;
      Boolean b = new Boolean("True");
      boolean b2 = false;
      System.out.printf("%b %b %b %b %b %b %b", s1, s2, s3,s4, s5, b, b2);

    }
  }

