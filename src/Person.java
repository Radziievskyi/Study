import java.util.Date;

public class Person {
    private String name;
    private int birthYear;
    private int age;
    private int Weight;
    private int Height;
    Date now = new Date();




    public Person(int Weight, int Height) {
        this.Weight = Weight;
        this.Height = Height;
            }

    String personInfo () {
        return name + age;
    }
    public String toString(){
        return "Person[name=" + name +", age=" + age + ", Weight=" + Weight +", Height=" +Height +"]";
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
        age = 2018 - birthYear;



    }
}



