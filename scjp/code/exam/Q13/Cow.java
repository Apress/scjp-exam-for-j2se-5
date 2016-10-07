 class Animal {
     public static void saySomething() { System.out.print(" Gurrr!"); 
   }
 }
 class Cow extends Animal {
    public static void saySomething() { 
     System.out.print(" Moo!"); 
    }
    public static void main(String [] args) {
         Animal [] animals = {new Animal(), new Cow()};
         for( Animal a : animals) {
           a.saySomething();
         }
         new Cow().saySomething();
    }
 }
