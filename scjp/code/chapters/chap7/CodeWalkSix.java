 class CodeWalkSix {
   public static void main(String [] args) {
          String stri = "inner";
          String stro = "outer";
      try {
           throw new Exception();
      } catch (Exception eo) {
        try {
           throw new Exception();
        } catch (Exception ei) { 
          System.out.print(stri);
        } finally { 
          System.out.print(" finally ");
        }  
          System.exit(1);
      }finally {
          System.out.print(stro);
      }
        System.out.print(stro);
    }
  }
