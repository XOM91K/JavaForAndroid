package Collections_Java;

public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;
    public void add(String value){
        array[size] = value;
        size ++;
        if (size == array.length){
            String[] newArray = new String[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }
    public void remove(int index){
        String[] newArray = new String[array.length - 1];
        for (int i = 0; i < index; i++){
            newArray[i] = array[i];
        }
        for (int i = index + 1; i < array.length; i++){
            newArray[i - 1] = array[i];
        }
        array = newArray;
        size --;
    }
    public String get(int index){
        return array[index];
    }
}
