package pack5;

public class Main {
    static void m1(A a) {

    }

    static void m2(B b) {

    }

    static void m3(C c) {

    }

    static void m4(D d) {

    }

    public static void main(String[] args) {
        MyClass2 myClass2 = new MyClass2();

        m1(myClass2);
        m2(myClass2);
        m3(myClass2);
        m4(myClass2);

        MyClass3 myClass3 = new MyClass3();

        m1(myClass3);
        m2(myClass3);
        m3(myClass3);
        m4(myClass3);
    }
}
