class ConventionCenter{     
  class AudioSystem { 
       public void test(String say){
         System.out.println(say);
       }
   }
}
public class JobFair{ 
   public static void main(String [] args) {
      String st = "Hello";
      ConventionCenter.AudioSystem as = new ConventionCenter().new AudioSystem();
     ConventionCenter cc = new ConventionCenter();
     ConventionCenter.AudioSystem as1 = cc.new AudioSystem();  

      as.test(st);
      as1.test(" hello2");
   }
}
