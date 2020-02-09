package interfaces;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainCat {
    public static void main(String[] args) throws CloneNotSupportedException {
        SuperCat tom = new SuperCat();
        tom.setName("tom");
        tom.setStrenght(300);
        tom.setWeight(20);

        SuperCat cloneCat = (SuperCat) tom.clone();
       // cloneCat.setName("vasya");
        cloneCat.setStrenght(200);


        System.out.println("tom.toString() = " + tom.toString());
        System.out.println("cloneCat.toString() = " + cloneCat.toString());
        tom.fight();
        tom.fly();
        tom.rebuild();

        SuperCat tom1 = new SuperCat();
        SuperCat vasya = new SuperCat();
        SuperCat blackCat = new SuperCat();
        SuperCat angel = new SuperCat();

        tom1.setWeight(20);
        tom1.setStrenght(80);
        vasya.setStrenght(90);
        vasya.setWeight(50);
        blackCat.setWeight(50);
        blackCat.setStrenght(90);
        angel.setStrenght(100);
        angel.setWeight(5);

        SuperCat[] arraySuperCat = new SuperCat[] {tom1, vasya, blackCat, angel};
        Arrays.sort(arraySuperCat);
        System.out.println("Arrays.toString(arraySuperCat) = " + Arrays.toString(arraySuperCat));



    }


}
