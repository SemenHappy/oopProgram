package interfaces;

public class MainCat {
    public static void main(String[] args) throws CloneNotSupportedException {
        SuperCat tom = new SuperCat();
        tom.setName("tom");
        tom.setStrenght(300);
        Object object = new Object();
        SuperCat cloneCat = (SuperCat) tom.clone();
       // cloneCat.setName("vasya");
        cloneCat.setStrenght(200);


        System.out.println("tom.toString() = " + tom.toString());
        System.out.println("cloneCat.toString() = " + cloneCat.toString());
        tom.fight();
        tom.fly();
        tom.rebuild();


    }


}
