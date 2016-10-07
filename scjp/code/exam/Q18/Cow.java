class Cow{
   final static Cow cow = new Cow();
   public static void main(String [] args) {
    Cow cowOne = cow;
    Cow cowTwo = cow.dive(cow);
    Cow cowThree = cow;
    System.out.println(cowOne==cowTwo);
    System.out.println(cowOne==cowThree);

}
   Cow dive(Cow c) {
       c = new Cow();
       return c;
   }
 }

