import java.io.*;
class TestFileConstructors {
 public static void main (String[] args){
   try{
    File f1 = new File("java/scjp");
    File f2 = new File("java/scjp", "temp/myProg.java");
    File f3 = new File(f1, "temp/myProg.java");
 
    System.out.println("path for f1: " + f1.getCanonicalPath());
    System.out.println("path for f2: " + f2.getCanonicalPath());
    System.out.println("path for f3: " + f3.getCanonicalPath());
   }catch (IOException ioe){
       ioe.printStackTrace();
   }
  }
}