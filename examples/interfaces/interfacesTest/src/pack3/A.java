package pack3;

public class A implements I1 {

    @Override
    public void print() {
        System.out.println("A");
    }

    public static void main(String[] args) {
        A a = new A();
        ((I2)a).print();
        ((I1)a).print();
    }
}
