 public class MethodCallTest{
     public static void main(String[] args) {
       int i = 15;
       long j = 16;
       byte b = 8;
       short s = 9;
       float f = 1.2f;
       double d = 2.56d;
       int result1, result2;
       MethodCallTest mct = new MethodCallTest();

     //   result1 = mct.add(f, d);
        result2 = mct.add(b, s);
         System.out.println("result2: "  + result2 );
        
      }
       public int add(int i, int j) {
            return (i+j);
       }
   }