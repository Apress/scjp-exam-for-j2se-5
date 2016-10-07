class Moo {
   private int count;
   int getCount(){
     return count;
   }
   
   void setCount(int c){
        count=c;
   }
}

class Baa {
   private int count;
   int getCount(){
     return count;
   }
   
   void setCount(int c){
        count=c;
        new Moo().setCount(count);
   }
}
