import java.io.PrintWriter;
 class MyFormatter {
  public static void main(String [] args) {
     int i = 420;
     int j = 420101;
     float x = 1;
     System.out.format("*%4d* ", i);
     System.out.format("*%4d* ", j); 
     System.out.format("*%4.1f* ", x);
  }
}


