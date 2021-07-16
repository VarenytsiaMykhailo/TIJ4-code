public class Car {

    static String str1 = "str1";

    static String str2;

    static {
        str2 = "str2";
        staticMethod();
    }

    static void staticMethod() {
        System.out.println(str1);
        System.out.println(str2);
    }

    public Car() {
        System.out.println("constructor");
    }

    int a = 1;

    void f1(){

    }

    int b = 2;
}
