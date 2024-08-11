package OOP_3_1;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Lion lion = new Lion();
        System.out.println(cat.canEatPerson);
        System.out.println(lion.canEatPerson);
        lion.setLegs(5);
        System.out.println(lion.getLegs());
        lion.Eat();
    }
}
