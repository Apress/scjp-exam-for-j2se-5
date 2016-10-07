    class EnumTest{
     enum Size{small, medium, large, Xlarge};
     public static void main(String [] args) { 
      for( Size s : Size.values()) {
        if (s == Size.small)
         System.out.println("small");
        else if (Size.medium.equals(s))
          System.out.println("medium");
        else if (s == Size.large)
          System.out.println("large");
        else if (s.equals("Xlarge"))
          System.out.println("Xlarge");
        else if ( s == "Xlarge");
           System.out.println("Xlarge");
     } 
    }
  }
