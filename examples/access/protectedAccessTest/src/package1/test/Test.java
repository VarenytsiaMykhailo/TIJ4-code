package package1.test;

import package1.p1A;

public class Test {
    private int a = 1;
    protected int b = 2;
    public int c = 3;

    void t() {
        p1A p1A = new p1A();
        System.out.println(p1A.c);
    }
}
