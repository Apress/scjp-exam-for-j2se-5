 class ArrayTest {
  public static void main(String [] args) {
      char[] myArray = {'a','b','c','d'};
      char[] i = myArray;
      char[] j = {myArray[2]}; 
      System.out.println(i[1]+" " + j[0]);
      System.out.println(j.length);
     // int[] x;
     //  System.out.println(x[0]);
  }
 }
