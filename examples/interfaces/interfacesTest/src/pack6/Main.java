package pack6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(new CharGenerator());
        while (s.hasNext())
            System.out.println(s.next());
    }
}
