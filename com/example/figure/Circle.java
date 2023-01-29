package figure;
public class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        this.radius = radius;
    }

    // getAreaメソッドを実装
    public double getArea() {
        return Math.PI * radius * radius;
    }
}