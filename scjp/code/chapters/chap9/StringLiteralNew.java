
//Compiler does not create a duplicate of a String literla.
// The new operator always creates a different string even if it is identical
public class StringLiteralNew {
  public static void main(String[] args) {
     String str1 = "Hello Dear!";
     String str2 = "Hello Dear!";
     String str3 = new String ("Hello Dear!");
     String str4 = new String ("Hello Dear!");

     
       if  (str1.equals(str2)) {
              System.out.println("str1 and str2 refer to identical strings.");
       } else {
           System.out.println("str1 and str2 refer to non-identical strings.");
       }
      
      if  (str1 == str2) {
              System.out.println("str1 and str2 refer to the same string.");
       } else {
           System.out.println("str1 and str2 refer to different strings.");
       }  
      if  (str1.equals(str3)) {
              System.out.println("str1 and str3 refer to identical strings.");
       } else {
           System.out.println("str1 and str3 refer to non-identical strings.");
       }
      
      if  (str1 == str3) {
              System.out.println("str1 and str3 refer to the same string.");
       } else {
           System.out.println("str1 and str3 refer to different strings.");
       }  

       if  (str3 == str4) {
              System.out.println("str3 and str4 refer to the same string.");
       } else {
           System.out.println("str3 and str4 refer to different strings.");
       }  

    }
}
