package core.basesyntax;

public class RightTriangle extends Figure {
    private int leg;
    private int base;

    public RightTriangle(String color, int base, int leg) {
        setColor(color);
        this.leg = leg;
        this.base = base;
        setArea((base * leg) / 2);
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "rightTriangle, " + "area: " + getArea()
                + " sq. units, " + "leg: " + leg + " units, " + "base: "
                + base + " units, " + "color: " + getColor());

    }
}
