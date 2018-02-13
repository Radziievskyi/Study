package EmpLo;

 class Employee {
      String name;
      String Departments;
       int salary;

    public Employee(String name,String department, int salary) {
        this.name= name;
        this.salary = salary;
        this.Departments = department;
    }


     static void Dep (Department Department) {
        switch (Department){
            case Folding:
                System.out.println("Folding");
                break;
            case Designer:
                System.out.println("Designer");
                break;
            case Financial:
                System.out.println("Financial");
                break;
            case Technical:
                System.out.println("Technical");
                break;
                default:
                    System.out.println("Wrong");
        }
    }

     @Override
     public String toString() {
         return "\n" +
                 " name='" + name + '\'' +
                 ", Departments='" + Departments + '\'' +
                 ", salary=" + salary;
     }
 }
enum Department {
    Financial, Technical,Designer,Folding;

}