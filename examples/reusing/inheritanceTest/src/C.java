public class C extends A {
    B b = new B(22);
    int asd = a;

    public C() {
        super(11);
        System.out.println("C");
    }

    public static void main(String[] args) {
        C c = new C();
    }
}
