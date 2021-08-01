public abstract class AbstractClassWithoutMethods {

    static void staticMethod(AbstractClassWithoutMethods arg) {
        ((AbstractClassWithoutMethodsImpl)arg).abcwmTest();
    }

}
