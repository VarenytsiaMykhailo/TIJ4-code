public class B extends A {
    /*
    @Override
    final public void f1() {
        System.out.println("B.f1");
    }
    */
    //@Override
    final private void f2() {
        System.out.println("B.f2");
    }

    public static void main(String[] args) {
        B b = new B();
        b.f1();
        b.f2();
    }
}
