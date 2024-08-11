package OOP_2_1;

public class Main7 {
    public static void main(String[] args) {
        Box7 box1 = new Box7(10, 20, 30);
        Box7 box2 = box1.copy();
        System.out.println(box1);
        System.out.println(box2);
        Box7 box3 = box1;
        System.out.println(box3);
    }
}
