package Java_3_8_Exceptions;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        try {
            System.out.println(a / b);
            int c = Integer.parseInt("asdasd");
        }
        catch (Exception excep) {
            System.out.println("Ошибка: " + excep);
        }
//        catch (ArithmeticException | NumberFormatException excep) {
//            System.out.println("Ошибка: " + excep);
//        }
        System.out.println("Я выполняюсь после исключения");
    }
}
