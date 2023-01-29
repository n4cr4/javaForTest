package figure;

public class Triangle implements Figure {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // getAreaメソッドを実装
    public double getArea() {
        return (base * height) / 2;
    }
}