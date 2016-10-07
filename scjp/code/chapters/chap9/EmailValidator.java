import java.util.regex.*;
public class EmailValidator {
   public static void main(String[] args)  {
       String email="";                          
      if(args.length < 1){
        System.out.println("Command syntax: java EmailValidator <emailAddress>");
        System.exit(0);
      }else {
           email = args[0];
      }

      //Look for for email addresses starting with
      //invalid symbols: dots or @ signs.
      Pattern p = Pattern.compile("^\\.+|^\\@+");
      Matcher m = p.matcher(email);
      if (m.find()) {
         System.err.println("Invalid email address: starts with a dot or an @ sign.");
         System.exit(0);
       }
      //Look for email addresses that start with
      //www. 
      p = Pattern.compile("^www\\.");
      m = p.matcher(email);
      if (m.find()) {
        System.out.println("Invalid email address: starts with www.");
         System.exit(0);
      }
      p = Pattern.compile("[^A-Za-z0-9\\@\\.\\_]");
      m = p.matcher(email);
      
      if(m.find()) {
        System.out.println("Invalid email address: contains invalid characters");
       
      } else{
              
          System.out.println(args[0] + " is a valid email address.");
      }

      
      
   }
}
