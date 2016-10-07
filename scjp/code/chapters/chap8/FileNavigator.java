import java.io.*;
class FileNavigator {
 public static void main (String[] args){
    String treeRoot = "."; //default root
    if (args.length >=1)treeRoot=args[0];
    File rootDir = new File(treeRoot);
     System.out.println("Root of navigation:" + rootDir.getAbsolutePath());
    // check if the root exists as a directory.
    if(!(rootDir.isDirectory())){
        System.out.println("The root of the naviagtion subtree does not exist as a directory!");
        System.exit(0);
    }
  
      FileNavigator fn = new FileNavigator();
      fn.navigate(rootDir);
  }

  public void navigate(File dir){
      System.out.println(" ");
      System.out.println("Directory " + dir + ":");
      String[] dirContent = dir.list();
      for (int i=0; i<dirContent.length; i++){
        System.out.print(" " + dirContent[i]);
        File child = new File(dir, dirContent[i]);
        if(child.isDirectory())navigate(child);
      }
  }  
}   