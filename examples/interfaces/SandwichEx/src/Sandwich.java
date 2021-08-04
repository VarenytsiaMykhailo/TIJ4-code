import static net.mindview.util.Print.*;

class Meal implements FastFood {
    Meal() {
        print("Meal()");
    }
}

class Bread implements FastFood {
    Bread() {
        print("Bread()");
    }
}

class Cheese implements FastFood {
    Cheese() {
        print("Cheese()");
    }
}

class Lettuce implements FastFood {
    Lettuce() {
        print("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
        print("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        print("PortableLunch()");
    }
}

public class Sandwich implements FastFood {
    private FastFood b = new Bread();
    private FastFood c = new Cheese();
    private FastFood l = new Lettuce();

    public Sandwich() {
        print("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
} /* Output:
Meal()
Lunch()
PortableLunch()
Bread()
Cheese()
Lettuce()
Sandwich()
*///:~
