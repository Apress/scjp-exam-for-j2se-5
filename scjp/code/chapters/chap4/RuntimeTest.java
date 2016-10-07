class RuntimeTest {
  public static void main (String [] args) {
    Runtime rt = Runtime.getRuntime();
     System.out.println("JVM free memory before running gc: " + rt.freeMemory());
     rt.gc();
     System.out.println("JVM free memory after running gc: " + rt.freeMemory());
    // Runtime rt1 = new Runtime();
  }
}