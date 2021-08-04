package pack2;

import pack1.SuperInterface;

public class A implements SuperInterface {
    @Override
    public void a1() {
        System.out.println(A.class);
        System.out.println(SuperInterface.a3());
    }

    @Override
    public void a2() {
        System.out.println(getClass());
    }
}
