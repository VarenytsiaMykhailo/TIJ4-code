package ex1_3;

public class Outer {

    private String str;

    class Inner {
        // TODO
        void print() {
            System.out.println("asd");
        }

        @Override
        public String toString() {
            return str;
        }
    }

    public Outer(String str) {
        this.str = str;
    }

    Inner createInnerInstance() {
        return new Inner();
    }

}
