package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        setColor(color);
        this.side = side;
        setArea(Math.pow(side, 2));
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "square, " + "area: " + getArea()
                + " sq. units, " + "side: " + side + "units, " + "color: " + getColor());
    }
}
