package ex6.b;

import ex6.a.A;

public class C extends B {

    public A getInner() {
        return new Inner();
    }
}
