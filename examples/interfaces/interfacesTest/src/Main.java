public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.print();
        Interface1 a1 = new A();
        a1.print();
        B b = new B();
        b.print();
        ((A)b).print();
        ((Interface1)b).print();
    }
}
