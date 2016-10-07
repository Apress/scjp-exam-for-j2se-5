import java.util.*;
class OrderingTest {
 static final Comparator<Employee> EMPLOYEE_ID = 
                                 new Comparator<Employee>() {
        public int compare(Employee e1, Employee e2) {
            return e1.getID().compareTo(e2.getID());
        }
 };
 public static void main(String[] args) {
      ArrayList<Employee> employeeList = new ArrayList<Employee>();
      employeeList.add(new Employee("Adam", 200));
      employeeList.add(new Employee("Brian", 2));
      employeeList.add(new Employee("Ginny", 1));
      employeeList.add(new Employee("Kulwinder", 10));
      employeeList.add(new Employee("Shindy", 15));
      

      
      Collections.sort(employeeList, EMPLOYEE_ID);
       for(Employee e:employeeList){ 
         System.out.println(e.getName() + " " + e.getID());
       }
    }
}

class Employee{
    int id;
    String name;
    Employee(String name, int id){
      this.id = id;
      this.name = name;
    }
  public Integer getID(){
     return id;
  }
  public String getName(){
     return name;
  }
}