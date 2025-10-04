package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setLeg(int leg) {
        this.firstLeg = leg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return ((secondLeg * firstLeg) / 2.0);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "rightTriangle, " + "area: " + getArea()
                + " sq. units, " + "firstLeg: " + firstLeg + " units, " + "secondLeg: "
                + secondLeg + " units, " + "color: " + getColor());

    }
}
