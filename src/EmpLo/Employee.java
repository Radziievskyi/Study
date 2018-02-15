package EmpLo;

public class Employee implements Comparable<Employee> {
     private String name;
      private String Departments;
      private int salary;

    public Employee(String name,String department, int salary) {
        this.name= name;
        this.salary = salary;
        this.Departments = department;
    }



public int compareTo (Employee emp){
        return this.salary - emp.salary;
}
    @Override
     public String toString() {
         return  "\n" +
                 " name='" + name +
                 ", Departments='" + Departments +
                 ", salary=" + salary;
     }
 }
