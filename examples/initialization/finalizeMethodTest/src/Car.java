public class Car {

    public Car() {
        this(2);
        System.out.println("first constructor");
    }

    public Car(int a) {
        System.out.println("Second constructor");
    }

    void m1() {
        m2();
        this.m2();
    }

    void m2() {
        System.out.println("m2");
    }

    @Override
    public void finalize() {
        System.out.println("finalize");
    }
}
