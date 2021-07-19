public class Stem extends Root {
    Component1 c1 = new Component1(11);
    Component2 c2 = new Component2(22);
    Component3 c3 = new Component3(33);

    public Stem() {
        System.out.println("Stem");
    }

    public static void main(String[] args) {
        Stem stem = new Stem();
    }
}
