package OOP_4_Interfaces;

public class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("Собачий корм");
    }
    public void run(){
        System.out.println("Собачка бежит");
    }
}