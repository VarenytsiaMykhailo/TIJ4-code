public class B extends A {

    public static void main(String[] args) {
        B b = new B();
        b.m1('c');
        b.m1(1);
        b.m1(2.4F);
        b.m1(false);
    }

    //@Override
    void m1(char c) {
        System.out.println("char");
    }
    //@Override // Dont work cause there is no m1 method with the double arg signature in the A class
    void m1(double d) {}
}
