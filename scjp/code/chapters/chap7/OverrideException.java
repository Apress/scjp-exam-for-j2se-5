 import java.io.*;
 public class OverrideException{
   public void someMethod() throws IOException {     
    }
   }

 class SubClassLegalOne extends OverrideException {
    public void someMethod() throws IOException {
   }
 }

   class SubClassLegalTwo extends OverrideException {
    public void someMethod()  {
   }
  } 

 class SubClassLegalThree extends OverrideException {
    public void someMethod() throws EOFException, FileNotFoundException {
   }
  }

 class SubClassIllegalOne extends OverrideException {
    public void someMethod() throws ClassNotFoundException {
   }
  } 

 class SubClassIllegalTwo extends OverrideException  {
    public void someMethod() throws Exception {
   }
  }  

class SubClassIllegalThree extends OverrideException  {
    public void someMethod() throws IOException, ClassNotFoundException {
   }
  }  