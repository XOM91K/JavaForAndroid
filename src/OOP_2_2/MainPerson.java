package OOP_2_2;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("John", 20);
        // person.age = -25; - ошибочный код
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.getAge());//person.age);
        person.setAge(-25);
        System.out.println("Age: " + person.getAge());
    }
}
