package SyntaxJava_1;

//Циклы 2
public class Loop2 {
    public static void main(String[] args) {
        // Таблица степеней числа 3 через цикл for:
        // в следующем формате вывода: 3 в степени i = k
        int number = 3;
        int result = number;
        int pow = 1;
        for (int i = 1; i <= 10; i++) {
            pow *= number;
            result = pow;
            System.out.println(number + " в степени " + i + " = " + result);
        }

    }
}
