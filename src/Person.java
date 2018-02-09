

public class Person {
    private String name;
    private int birthYear;
    int age;
    private int Weight;
    private int Height;



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



