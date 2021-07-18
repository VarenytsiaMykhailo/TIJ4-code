public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.initTmp();
        System.out.println(a.tmp.str);
    }
}

class A {
    B tmp;

    void initTmp() {
        tmp = new B();
    }
}

class B {
    String str = "str";
}