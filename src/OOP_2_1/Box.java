package OOP_2_1;

public class Box {
    double length; // длина
    double width; // ширина
    double height; // высота

    double getVolume() {
        double volume = length * width * height;
        return volume;
    }
}
