class CodeWalkNine{
   public static void main(String [] args) {
    NissanMaxima s1 = new NissanMaxima();  s1.color = "blue";
    NissanMaxima s2 = new NissanMaxima();  s2.color = "blue";
       System.out.print("Nissan Maxima: ");
       if (s1.equals(s2)) System.out.print("equals ");
       if (s1 == s2) System.out.print("== ");
        s1=s2;
       if (s1.equals(s2)) System.out.print("equals_now ");
       if (s1 == s2) System.out.println("==_now");  

       
       Lexus x1 = new Lexus();  x1.color = "red";
       Lexus x2 = new Lexus();  x2.color = "red";
       System.out.print("Lexus: ");      
       if (x1.equals(x2)) System.out.print("equals ");
       if (x1 == x2) System.out.print("== ");
        x1=x2;
       if (x1.equals(x2)) System.out.print("equals_now ");
       if (x1 == x2) System.out.print("==_now");    
  
   }
 }


class NissanMaxima {
  String color;  
  public String getColor() {
     return color;
 } 
} 
 class Lexus {
  String color;  
    public boolean equals(Object o) {
    return color.equals(((Lexus)o).color);
  } 
} 

