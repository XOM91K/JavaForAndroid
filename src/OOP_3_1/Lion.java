package OOP_3_1;

public class Lion extends CatFamily {
    public Lion(){
        super(4, 2, true);
        legs = 5;
    }
    public void Eat(){
        System.out.println("Кушаю животных");
    }
}
