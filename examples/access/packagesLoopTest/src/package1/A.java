package package1;

import package2.B;

public class A {
    static int counter = 0;
    B b = new B();

    public void a() {
        System.out.println("a");
        if (counter == 10)
            return;
        else {
            //b.b();
            counter++;
        }
    }
}
