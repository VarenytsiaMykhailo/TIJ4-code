package ex5;

public class Main {
    public static void main(String[] args) {
        System.out.println("asd");
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        System.out.println(inner);
       // Outer.Inner inner1 = new Outer.Inner(); // Dont working
    }
}
