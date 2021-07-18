package package2;

public class p2A {
    private int a = 1;
    protected int b = 2;
    public int c = 3;
    int d = 4; // default-package access. This field is not available from p1B class

}

class p2ASD {
    public static int a = 1;
    protected int b = 2;
    int c = 3;
}
