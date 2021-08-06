package ex1_3;

public class Main {
    public static void main(String[] args) {

        Outer.Inner inner = new Outer("abracodabra").createInnerInstance();
        inner.print();
        System.out.println(inner);
    }
}
