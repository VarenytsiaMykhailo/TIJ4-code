package package1;

import package2.p2A;
import package2.*;

public class p1B extends p2A {

    public static void main(String[] args) {
        p1B p1B = new p1B();
        p1B.m();
    }

    void m() {
        p1A p1A = new p1A();
        System.out.println(p1A.b);;
        System.out.println(p1A.c);
        //System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //System.out.println(d); // default-package access. This field is not available from p1B class
        // System.out.println(p2ASD.a); default-package access. This class is not available from p1B class
    }
}
