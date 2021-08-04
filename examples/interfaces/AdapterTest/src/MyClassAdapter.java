public class MyClassAdapter extends MyClass implements Processor {
    @Override
    public String name() {
        return getClass().toString();
    }

    @Override
    public Object process(Object input) {
        return m((String) input);
    }
}
