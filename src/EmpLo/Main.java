package EmpLo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);
        Employee [] emp = new Employee[5];
        emp[0]= new Employee("Ivan", "Folding",4950);
        emp[1]= new Employee("Petro","Designer",7860);
        emp[2]= new Employee("Ihor","Financial",6380);
        emp[3]= new Employee("Artur","Technical",5445);
        emp[4]= new Employee("Ruslan","Designer",7350);

        System.out.println("Befor:"  + Arrays.toString(emp));
        Arrays.sort(emp);
        System.out.println("AFTER:" + Arrays.toString(emp));















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
    }

enum Department {
    Financial, Technical,Designer,Folding;

}
