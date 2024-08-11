package OOP_2_2;
// Ключевые слова static и final и аргументы переменной длины
public class MyMath {
    public static final double PI = 3.14;
    public static double lengthCircle(double radius) {
        return 2 * radius * PI;
    }
    public static double squareCircle(double radius) {
        return PI * radius * radius;
    }
}
