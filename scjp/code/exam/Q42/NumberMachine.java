class NumberMachine{
      public static void main(String [] args) {
        Integer wi1 = new Integer("420");
        int i = 101;
        Integer wi2 = i*420/101;
        if(wi1 == wi2) System.out.print(" =="); 
        if(wi1.equals(wi2)) System.out.print(" equal"); 
         float f = 1.23f;
         new NumberMachine().printIt(f);
      }
         
      void printIt(Float f){
         System.out.println(" Float");
      }
      void printIt(double  d){
         System.out.println(" double");
      }
  }

