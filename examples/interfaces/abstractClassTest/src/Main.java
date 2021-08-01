public class Main {
    public static void main(String[] args) {
        System.out.println("ASD");
        //! A a = new A();

        PrinterImpl printerImpl = new PrinterImpl();
        printerImpl.print();

        //printerImpl.test(); // private in Printer

        AbstractClassWithoutMethodsImpl acwmImpl = new AbstractClassWithoutMethodsImpl();
        AbstractClassWithoutMethods.staticMethod(acwmImpl);
    }
}
