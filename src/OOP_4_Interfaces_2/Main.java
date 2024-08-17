package OOP_4_Interfaces_2;
//Main.java
public class Main {
    public static void main(String[] args) {
        Director dir1 = new Director();
        //Programmer prog1 = new Programmer();
        dir1.force(new Worker() {
            @Override
            public void Work() {
                System.out.println("Работаю");
            }
        });
    }
}
