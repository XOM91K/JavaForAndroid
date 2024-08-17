package OOP_4_Interfaces;
//Main.java
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();

        Animal animal1 = new Dog();
        Dog dog1 = (Dog) animal1;
        animal1.eat();

        ArrayList<AbleToRun> animals = new ArrayList<>();
        animals.add(cat);
//        animals.add(dog); //если попытаться добавить
//        animals.add(bird); //то возникнет ошибка
        for (AbleToRun animal : animals) {
            animal.run();
        }
    }
}
//        ArrayList<AbleToRun> animals = new ArrayList<>();
//        animals.add(cat);
//        animals.add(dog)

//        Animal animal = new Dog();
//        animal.eat();
//        Dog dog = (Dog) animal;
//        dog.run();
//
//    }
//}
