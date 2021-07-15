public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");
        new Car().m1();
        System.gc();
        Thread.sleep(1111);
        System.out.println("asd");
    }
}
