package Collections_Java;

public class MainMyArrayList {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        for (int i = 0; i < 20; i++) {
            list.add(Integer.toString(i));
        }
        list.remove(10);
        for (int i = 0; i < 20; i++) {
            System.out.print(list.get(i) + " " + " ");
        }
    }
}
