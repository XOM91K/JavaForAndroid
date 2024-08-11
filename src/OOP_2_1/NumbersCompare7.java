package OOP_2_1;
//Объекты в качестве параметров
public class NumbersCompare7 {
    int number;
    public NumbersCompare7(int number) {
        this.number = number;
    }
    public int compare(NumbersCompare7 other) {
        if (number > other.number) {
            return 1;
        } else if (number < other.number) {
            return -1;
        } else {
            return 0;
        }
    }
}
