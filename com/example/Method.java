
public class Method {
    public static void main(String[] args){
        double dividend = 10;
        double result = 0;
        result = half(dividend);
        System.out.println(result);
    }
    private static double half(double dividend){
        return dividend / 2;
    }
}
