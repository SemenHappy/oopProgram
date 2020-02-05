package interfaces;

public class Cat implements Talkable, Swimable, Flyable {
    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public void printSwim() {
        if (swim()){
            System.out.println("I can swim");
        }


    }

    @Override
    public void talk(){
        System.out.println("Meoy");
    }

    @Override
    public void print() {
        System.out.println("Непонятно");
    }

    @Override
    public void fly() {
        System.out.println("I can't Fly");
    }
}
