package ex7;

public class A {

    private int a = 123;

    private class Inner {
        void changeA() {
            A.this.a = 333;
            f();
        }
    }

    private void f() {
        System.out.println("A");
        System.out.println(a);
    }

    public void runInner() {
        Inner inner = new Inner();
        inner.changeA();
    }


}
