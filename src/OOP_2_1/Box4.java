package OOP_2_1;

public class Box4 {
    double length;
    double width;
    double height;
    void set_Dimensions(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    double get_Volume() {
        return length * width * height;
    }
}
