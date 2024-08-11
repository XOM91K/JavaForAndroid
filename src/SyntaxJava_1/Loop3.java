package SyntaxJava_1;

//Циклы 3
public class Loop3 {
    public static void main(String[] args) {
        //Делители числа 100_000
        int number = 100_000;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
