public class Main {

    public static void main(String[] args) {
        Person p1 = new Person(78, 186);
        p1.setName("Ivan");
        p1.setBirthYear(1995);
        String info = p1.toString();
        System.out.println(info);


        Person p2 = new Person(94,215);
        p2.setName("Fedir");
        p2.setBirthYear(1989);
        String info2 = p2.toString();
        System.out.println(info2);

        Person p3 = new Person(68,189);
        p3.setName("Oleh");
        p3.setBirthYear(1996);
        String info3 = p3.toString();
        System.out.println(info3);

        Person p4 = new Person(88,193);
        p4.setBirthYear(1991);
        p4.setName("Artur");
        String info4= p4.toString();
        System.out.println(info4);

        Person p5 = new Person(72,172);
        p5.setName("Dima");
        p5.setBirthYear(1974);
        String info5 = p5.toString();
        System.out.println(info5);







    }
}


