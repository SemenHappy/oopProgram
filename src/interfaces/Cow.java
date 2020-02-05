package interfaces;

public class Cow extends SuperCow implements Talkable, Flyable {

    @Override
    public void fly() {
        System.out.println("I can FLY");
    }

    @Override
    public void talk(){
        System.out.println("Muuuu");
    }

}
