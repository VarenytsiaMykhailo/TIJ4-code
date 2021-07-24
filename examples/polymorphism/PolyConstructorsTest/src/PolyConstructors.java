

class Glyph {

    void draw() {
        System.out.println("Glyph.draw()");
    }

    Glyph() {
        System.out.println("Glyph() before draw()");
        draw(); // Calls RoundGlyph.draw method; moreover, radius and other fields used in method draw will be zero
        this.draw(); // The same result
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {

    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

class RoundGlyphUpdatable extends RoundGlyph {
    private int radius = 1;

    RoundGlyphUpdatable(int r) {
        super(r);
        radius = r;
       //System.out.println("RoundGlyphUpdatable.RoundGlyph(), radius = " + radius);
    }

    void draw() {
        System.out.println("RoundGlyphUpdatable.draw(), radius = " + radius);
    }
}


public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new Glyph();
        System.out.println("////////////////////////");
        new RoundGlyphUpdatable(3);
    }
} /* Output:
Glyph() before draw()
RoundGlyph.draw(), radius = 0
Glyph() after draw()
RoundGlyph.RoundGlyph(), radius = 5
*///:~