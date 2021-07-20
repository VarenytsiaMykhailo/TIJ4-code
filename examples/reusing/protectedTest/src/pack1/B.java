package pack1;

public class B extends A {
    void f() {
        m();
    }

    public static void main(String[] args) {
        B b = new B();
        ((A)b).m();
        A a = new A();
        //((B)a).m(); // ClassCastException
        ((A)((Object)a)).m();
        b.f();
    }
}
