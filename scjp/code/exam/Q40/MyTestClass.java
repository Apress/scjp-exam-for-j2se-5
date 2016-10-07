class MyTestClass{
      static Short s1,s2;
      public static void main(String [] args) {
        int i;
        s1 = 4;
        try{
          i = s1 + s2;
       
         }catch (RuntimeException re){

         //}catch (NullPointerException ne){
           System.out.print("Ouch!");
         }
     }
  }

