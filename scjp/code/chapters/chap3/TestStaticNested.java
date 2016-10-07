 
      class TestStaticNested {
        public static void main(String[] args) {
           String ext = "From external class";
            new MyTopLevel().gateToStatic();
           MyTopLevel.StaticNested sn = new MyTopLevel.StaticNested();
           sn.accessStaticNested(ext);   

        }
 
      }

        class MyTopLevel{
         private static String top = "From top level class";
         
         public static void gateToStatic(){
            StaticNested s = new StaticNested();
            s.accessStaticNested(top);
         }  
 
         static class StaticNested {
           public void accessStaticNested(String st) {
              System.out.println(st);
           }
         } 
    
        }