package SyntaxJava_1;

// Циклы
public class Loop {
    public static void main(String[] args) {
        System.out.println("Второй способ:");
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println("Второй способ:");
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 4);
        System.out.println("Третий способ:");
        for (int j = 1; j <= 4; j++) {
            System.out.println(j);
        }
        System.out.println("Четвертый способ:");
        int k = 1;
        while (k <= 4) {
            System.out.println(k);
            k++;
        }
    }
}
