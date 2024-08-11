package OOP_2_2;
// аргументы переменной длины
public class Sums {
    public static int mySum(int... numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }
}
