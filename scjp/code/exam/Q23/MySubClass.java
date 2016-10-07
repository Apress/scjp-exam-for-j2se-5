class MySuperClass {
   private int x;
   MySuperClass(int i){
     x=i;
     System.out.println("mySuperClass: "+ x);
   }
 }
 class MySubClass extends MySuperClass { 
   public static void main(String[] args){
       new MySubClass();
       new MySubClass(3);
   } 

    MySubClass(int i){
        super(i);
    }
    MySubClass() {
      System.out.println("Default");      
    }
 }
