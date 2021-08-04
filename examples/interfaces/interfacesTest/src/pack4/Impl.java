package pack4;

public class Impl implements D {

    @Override
    public void a() {
        System.out.println("Impl");
    }

    public static void main(String[] args) {
        Impl impl = new Impl();
        impl.a();
    }
}
