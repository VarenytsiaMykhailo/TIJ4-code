import java.util.Random;
import java.util.Scanner;

public class CoinToss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random(1);
        int c = in.nextInt();
        while (c != 0) {
            System.out.println(random.nextInt(2));
            c = in.nextInt();
        }
        long l1 = 0x2f;
        long l2 = 0123;
        System.out.println(Long.toBinaryString(l1));
        System.out.println(Long.toBinaryString(l2));
    }
}
