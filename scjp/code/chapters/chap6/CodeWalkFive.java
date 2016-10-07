class CodeWalkFive {
  public static void main(String [] args) {
         boolean x = true;
         boolean y = false;
         int i = 1;
         int j = 1;
        if((i++ == 1) && (y = true))i++;
        if((++j == 1) && (x = false))j++;
        if((x = false) || (++i == 4))i++;
        if((y = true) || (++j == 4))j++;
        System.out.print("i=" + i);
        System.out.print(" j=" + j);
        System.out.print(" x=" + x);
        System.out.print(" y=" + y);
   }
 }
