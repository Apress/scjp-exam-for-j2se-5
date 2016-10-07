class CodeWalkOne {
      public static void main(String [] args) {
       int [] counts = {1,2,3,4,5};
       counts[1] = (counts[2] == 2) ? counts[3] : 99;
       System.out.println(counts[1]);
    }
}

