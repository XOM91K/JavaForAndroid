package OOP_2_1;

//Ведение в ООП
public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.height = 10;
        box1.length = 10;
        box1.width = 10;
        //Посчитаем объем коробки
        double volume = box1.height * box1.length * box1.width;
        System.out.println(volume);
        double volume2 = box1.getVolume();
        System.out.println(volume2);
    }
}
