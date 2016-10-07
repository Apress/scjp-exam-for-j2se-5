     class TestConstructors {
       public static void main(String[] args) {
            new MySubSubClass();
        }

     }

        class MySuperClass {
           int superVar = 10;
        MySuperClass(){
           System.out.println("superVar: " + superVar);
        }  
        MySuperClass(String message) {
          System.out.println(message + ": " + superVar);
        }
      }       
       
       class MySubClass extends MySuperClass {
            int subVar = 20;
            MySubClass() {
               super("non default super called");
               System.out.println("subVar: " + subVar);
            }
       }  
      
      class MySubSubClass extends MySubClass {
            int subSubVar = 30;
            MySubSubClass() {
               this("A non-deafult constructor of MySubSubClass");
               System.out.println("subSubVar: " + subSubVar);
            }
            
       MySubSubClass(String message){
              System.out.println(message);
            }
       }  




 