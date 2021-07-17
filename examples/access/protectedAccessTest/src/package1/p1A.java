package package1;

import package1.test.Test;

public class p1A {
    private int a = 1;
    protected int b = 2;
    public int c = 3;

    void f() {
        Test test = new Test();
        System.out.println(test.c);
    }
}
