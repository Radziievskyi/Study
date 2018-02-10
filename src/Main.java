import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть значення М");
        int m = scan.nextInt();
        if (m > 0) {
            System.out.println("n=1");
        } else {
            if (m == 0) {
                System.out.println("n=0");
            } else if (m < 0) System.out.println("n=-1");
        }


        System.out.println("Введіть число:");
        int z = scan.nextInt();
        if (z % 2 == 0) {
            System.out.println("Парне");
        } else {
            if (z % 2 == 1) {
                System.out.println("Не парне");
            }
        }


            System.out.println("Введіть любе число:");
            int q = scan.nextInt();
            if (q > 0) {
                System.out.println("Позитивне");
            } else {
                if (q == 0) {
                    System.out.println("Zero");
                } else {
                    if (q < 0) {
                        System.out.println("Негативне");
                    }
                }
            }




        int f=10;
        int sum=0;
        for (int i=1; i<=f; i++){
            sum = sum + i;
        }
        System.out.println("Сума 10 натуральних чисел:" + sum);

        System.out.println("Введіть число:");
        int w=scan.nextInt();
        for (int i=1;i<=w; i++) {
            for (int u = 1; u <= i; u++)
                System.out.print("*");

                    System.out.println("");

            }


        System.out.println("Введіть число:");
        int j=scan.nextInt();
        int y=j;
        for (int u=1; u<=j; u++) {
            for (int c=1;c<y;c++)
                System.out.print(" ");
            y--;
            for (int c=1; c<=2*u-1; c++)
                System.out.print("*");
            System.out.println("");
        }


        System.out.println("Введіть число:");
        int n=0;
        int t=1;
        int p=scan.nextInt();
        for (int i=1;i<=p;i++){
            System.out.print(t);
            if (i<p){
                System.out.print("+");
            }
            n=n+t;
            t=(t*10)+1;

        }
        System.out.println("\n The sum is:  " + n);


        System.out.println("Give year:");
        int year= scan.nextInt();
        if (year % 4 ==0 &&(year %100 !=0 || year % 400==0)){
            System.out.print("Year is leap");
        } else {
            System.out.print("Year is not a leap");
        }







    }
}