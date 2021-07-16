import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Currencies currency = Currencies.JPY;

        System.out.println(Currencies.values());
        System.out.println(Arrays.toString(Currencies.values()));
        System.out.println(Arrays.toString(Currencies.values()));
        System.out.println(currency.toString());
        System.out.println(Currencies.valueOf("RUB"));
        System.out.println(currency.ordinal());

        for (Currencies c : Currencies.values()) {
            System.out.println(c + " " + c.ordinal());
        }

        currency = Currencies.USD;

        switch (currency) {
            case USD: {
                System.out.println("dollar");
                break;
            }
            default:
                System.out.println("default");
        }
    }
}
