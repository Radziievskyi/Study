public class Main {

    public static void main(String[] args) {
        test(Countries.POLAND);

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