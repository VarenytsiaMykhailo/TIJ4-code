public class Main {
    public static void main(String[] args) {
        MyClassAdapter myClassAdapter = new MyClassAdapter();
        System.out.println(myClassAdapter.m("abra"));
        System.out.println(myClassAdapter.m("abrac"));

        Apply.process( myClassAdapter, "abrac");
    }
}
