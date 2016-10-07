 
      class TestNestedProt {
        public static void main(String[] args) {
           MyTopLevel mt = new MyTopLevel();
           mt.createNested();
           MyTopLevel.MyInner inner = mt.new MyInner();
           inner.accessTop();
           
     //       MyTopLevel mts = new MyTopLevel();
     //      MyTopLevel.MyNested mnested = mts.new MyNested();
      //       mts.MyNested.accessTop();

        }
 
      }

        class MyTopLevel{
         private String me = "Top level class";
         private static String meStatic = "Top level from static";
         
         public void createNested() {
            MyNested mnest = new MyNested();
            mnest.accessTop();
            MyInner minn = new MyInner();
            minn.accessTop();
         }
         static class MyNested {
           public void accessTop() {
              System.out.println("Nested to Top:" + meStatic);
           }
         }
    
           class MyInner {
           public void accessTop() {
              System.out.println("Inner to Top:" + me);
           }
         }
      }