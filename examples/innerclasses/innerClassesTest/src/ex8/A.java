package ex8;



public class A {

    public class Inner {
        private void fprivate() {
            System.out.println("Inner private");
        }

        public void fpublic() {
            System.out.println("Inner public");
        }
    }

    void test() {
        Inner inner = new Inner();
        inner.fprivate();
        inner.fpublic();
    }

    public static void main(String[] args) {
        A a = new A();
        a.test();
    }
}
