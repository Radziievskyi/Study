import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello Guest");
        System.out.println("What is your name?");
        String name = scan.next();
        System.out.println("How old are you?");
        int number = scan.nextInt();

        double Pi = 3.1415;
        System.out.println("Введіть радіус");
        int k = scan.nextInt();
        int p1 = (2 * (int)Pi * k);
        System.out.println("Периметр" + "=" + p1);
        int a1 = (int)Pi * (int)Math.pow(k,2);
        System.out.println("Площа" + "=" + a1);



        int a, b;
        System.out.println("Введіть число А");
        a = scan.nextInt();
        System.out.println("Введіть число B");
        b = scan.nextInt();
        int result = a+b;
        System.out.println(result);
        result = a-b;
        System.out.println(result);
        result = a*b;
        System.out.println(result);
        result = a/b;
        System.out.println(result);



        int x;
        System.out.println("Введіть число!");
        x = scan.nextInt();
        int result2 = (int)Math.pow(x,2);
        System.out.println(result2);
        result2 = (int)Math.sqrt(x);
        System.out.println(result2);

    }
}
