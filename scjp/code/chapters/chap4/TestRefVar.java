class TestRefVar {
 public static void main (String [] args) {
    Student st = new Student("John", 100);
    System.out.println("The original student info:");
    System.out.println("name: " + st.getName() + " score: " + st.getScore());
    TestRefVar tr = new TestRefVar();
    tr.modifyRef(st);
    System.out.println("The modified student info in the calling method:");
    System.out.println("name: " + st.getName() + " score: " + st.getScore());
 }
 void modifyRef(Student student){
        student.setScore(50);
        student = new Student("Mary", 75);
        System.out.println("The modified student info in the called method:");
        System.out.println("name: " + student.getName() + " score: " + student.getScore());
 }
}

 class Student {
  int score;
  String name;
 Student(String st, int i){
   score=i;
   name=st;
 } 
 String getName(){
     return name;
 }
 int getScore(){
      return score;
  }
  void setScore(int i){
      score = i;
  }
}
