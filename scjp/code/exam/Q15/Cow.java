 class Animal {
       void saySomething() {
       System.out.print(" Gurrr!"); 
     }
 }
 class Cow extends Animal {
     protected void saySomething() { 
     System.out.print(" Moo!"); 
    }
    public static void main(String [] args) {
         System.out.print(" MooYa!");
         Animal [] animals = {new Animal(), new Cow()};
         for( Animal a : animals) {
           a.saySomething();
         }
         
    }
 }
