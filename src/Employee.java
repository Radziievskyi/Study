public class   Employee {
    private String name;
    private double rate;
    private int hours;
    private static int totalHours;

    public Employee() {


        }
    public Employee (String name, double rate){
        this.name = name;
        this.rate = rate;

    }
    public Employee(String name, double rate,int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;


    }
     double Salary() {
        return hours * rate;

    }
    double bonuses(){
        return 0.2 * Salary();
    }
    public double changeRate(){
        if (hours<160){
            rate= rate-1;
        } else {
            if (hours>160){
                rate = rate +1;
            }
        }
                 return rate;
        }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;

    }

    public void setHours(int hours) {
        this.hours = hours;

    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary=" + Salary() +
                ", bonuses=" + bonuses() +
                '}';

    }
}

