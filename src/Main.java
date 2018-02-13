public class Main {

    public static void main(String[] args) {
        test(Countries.BRAZIL);
        int[] mass = {5, -6, 8, 17, -36, 48, 22, 7, -18, -3};
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + ", ");
        }

        int max = mass[0];
        int z = 0;

        while (z < mass.length) {
            if (mass[z] > max) {
                max = mass[z];
            }
            z++;
        }
        System.out.println("\n" + "max=" + max);


        int sum = 0;
        for (int b = 0; b < mass.length; b++) {
            if (mass[b] > 0)
                sum = sum + mass[b];
        }
        System.out.println("sumPositive=" + sum);

        int sumAll = 0;
        for (int p = 0; p < mass.length; p++) {
            sumAll += mass[p];
        }
        System.out.println("sumAll=" + sumAll);



    }









    static void test(Countries Countries) {
        switch (Countries) {
            case SPAIN:
                System.out.println("Eurasia");
                break;
            case BRAZIL:
                System.out.println("South america");
                break;
            case POLAND:
                System.out.println("Eurasia");
                break;
            case UKRAINE:
                System.out.println("Eurasia");
                break;
            case ARGENTINA:
                System.out.println("South america");
                break;
            default:
                System.out.println("something wrong");
        }
    }
}
enum Countries {
    UKRAINE, POLAND, SPAIN, BRAZIL, ARGENTINA
}