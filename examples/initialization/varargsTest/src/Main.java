public class Main {
    public static void main(String... args) {
        Main main = new Main();
        main.m("str1", "str2", "str3");
        main.m(new String[]{"str1", "str2", "str3"});

    }

    void m(String... strings) {
        for (String str : strings)
            System.out.println(str);
    }
}
