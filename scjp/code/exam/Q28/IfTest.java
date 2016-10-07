class IfTest{
 public static void main(String [] args) {
   boolean b1 = true;
   boolean b2 = false;
   int i = 10;
   if((b1 == true) && (b2 = true))  i++;
   if((b2 == false) && (i++ == 12)) {
     i++;
   }
   if((b2 == true) || (i++ == 11)) {
    i++;
   }

        System.out.println("i = " + i);
   }
 }

