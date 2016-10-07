//import java.io.*;
public class RobotManager {
   public static void main(String[] args) {
       Robot robot;
       int nargs=args.length;
       if(nargs <= 1){
          System.out.println("There must be at least two arguments in the command!");
          System.out.println("Example: java RobotManager Mary Kaan");
          System.exit(0);
       }else {
          for(int i=1; i<nargs; i++){
             robot = new Robot();
             robot.setName(args[i]);
             robot.sayHelloTo(args[0]);
          }
       }
      
  }
}

class Robot {
  private String myName = "nobody";
  public void setName(String name) {
      myName = name;
  }
  public void sayHelloTo(String name) {
      System.out.println("Hello " + name + "!"); 
      System.out.println("My name is Robo " + myName + "."); 
  }    
}