package ex6.b;

import ex6.a.A;

public class B {
    protected class Inner implements A {

        @Override
        public void m() {
            System.out.println("B.Inner");
        }
    }
}
