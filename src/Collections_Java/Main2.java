package Collections_Java;

import java.util.ArrayList;
import java.util.HashSet;

//Ссылочные типы
public class Main2 {
    public static void main(String[] args) {
        int a = 5;
        Integer a1 = 5;
        byte b;
        Byte b1;
        short c;
        Short c1;
        long d;
        Long d1;
        float e;
        Float e1;
        double f;
        Double f1;
        boolean g;
        Boolean g1;
        char h;
        Character h1;
        String i;
        String i1;
        int number1 = 1000;
        int number2 = 2000;
        //System.out.println(Integer.toString(number1) + Integer.toString(number2));
        ArrayList<String> arr = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        set.add("Раз");
        set.add("Два");
        set.add("Раз");
        System.out.println(set);

    }
}
