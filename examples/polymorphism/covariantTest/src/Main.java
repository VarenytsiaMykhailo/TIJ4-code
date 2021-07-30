public class Main {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
        //System.out.println((B)a); // CCE
        B b = new B();
        A a1 = b;
        System.out.println(a1);
        System.out.println((B)a1);

        B bb = new B();
        System.out.println(bb instanceof A);
        System.out.println(bb instanceof B);
        System.out.println(bb.hashCode());
        bb.c = 1;
        System.out.println(bb.hashCode());
        bb.str = "22";
        System.out.println(bb.hashCode());

    }
}
