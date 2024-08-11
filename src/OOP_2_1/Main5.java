package OOP_2_1;
//Конструкторы
public class Main5 {

    public static void main(String[] args) {
        Box5 box1 = new Box5();
        System.out.println(box1.length);
        System.out.println(box1.width);
        System.out.println(box1.height);
        Box5 box2 = new Box5(10, 20, 30);
        System.out.println(box2.length);
        System.out.println(box2.width);
        System.out.println(box2.height);
    }
}
