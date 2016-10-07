class MyClass {
 public static void main(String [] args){
  int i = 0;
  step1:
  for(; i < 10; i++) {
    if(i == 4) {
     i = 6;
     break step1;
    }
    else if(i == 2) { 
     i++;
     continue; 
    }
   
    System.out.print(i + " ");
 }
}
}


