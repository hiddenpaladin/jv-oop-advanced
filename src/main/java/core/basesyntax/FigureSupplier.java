package core.basesyntax;
import java.util.Random;
public class FigureSupplier {
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    final int MAX_DIMENSION = 30;
    final int DEFAULT_RADIUS = 10;
    final int FIGURE_TYPE_COUNT = 5;
    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }
    public void setColorSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }
    public Figure getDefaultFigure() {
        return new Circle("WHITE",DEFAULT_RADIUS);
    }
    public Figure getRandomFigure() {
        return switch (random.nextInt(FIGURE_TYPE_COUNT)) {
            case 0 -> {
                int RANDOM_INT = random.nextInt(MAX_DIMENSION) + 1;
                String RANDOM_COLOR = colorSupplier.getRandomColor();
                yield new Circle(RANDOM_COLOR,RANDOM_INT);
            }
            case 1 -> {
                int RANDOM_INT = random.nextInt(MAX_DIMENSION) + 1;
                String RANDOM_COLOR = colorSupplier.getRandomColor();
                yield new Rectangle(RANDOM_COLOR,RANDOM_INT,
                    RANDOM_INT);
            }
            case 2 -> {
                int RANDOM_INT = random.nextInt(MAX_DIMENSION) + 1;
                String RANDOM_COLOR = colorSupplier.getRandomColor();
                yield new RightTriangle(RANDOM_COLOR,RANDOM_INT,
                    RANDOM_INT);
            }
            case 3 -> {
                int RANDOM_INT = random.nextInt(MAX_DIMENSION) + 1;
                String RANDOM_COLOR = colorSupplier.getRandomColor();
                yield new Square(RANDOM_COLOR,RANDOM_INT);
            }
            case 4 -> {
                int RANDOM_INT = random.nextInt(MAX_DIMENSION) + 1;
                String RANDOM_COLOR = colorSupplier.getRandomColor();
                yield new IsoscelesTrapezoid(RANDOM_COLOR, RANDOM_INT,
                    RANDOM_INT, RANDOM_INT);
            }
            default -> getDefaultFigure();
        };
    }
}