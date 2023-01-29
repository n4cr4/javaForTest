import figure.Circle;
import figure.Figure;
import figure.Triangle;

public class FigureMain {
    public static void main(String[] args) {
        // 図形のインスタンスを配列に格納
        Figure[] figures = new Figure[] {
                new Circle(5),
                new Triangle(3, 4),
                new Circle(2),
                new Triangle(7, 8),
                new Circle(1),
                new Triangle(9, 10),
                new Circle(4),
                new Triangle(11, 12),
                // new Circle(-1) // 例外発生
        };

        // for文で図形の面積を出力
        for (Figure figure : figures) {
            // 各図形のgetAreaメソッドを呼び出し
            // （ここでポリモーフィズムが発生）
            System.out.println("面積: " + figure.getArea());
        }
    }
}