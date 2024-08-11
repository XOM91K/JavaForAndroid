package OOP_2_1;
//return объекта
public class Box7 {
    double width;
    double height;
    double length;
    Box7(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    Box7 copy() {
        return new Box7(this.length, this.width, this.height);
    }
}
