package collection;

import exeption.Car;
import interfaces.Cat;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class MyArraysHomeWork {
    public static void main(String[] args) {

        System.out.println("Create empty List");
        ArrayList<Car> cars = new ArrayList<>();
        System.out.println(cars.toString());


        System.out.println("Create List with 20 ");
        ArrayList<String> strings = new ArrayList<>(20);
        System.out.println(strings.size());
        strings.add("Bob");
        strings.add("Bob1");
        strings.add("Bill");
        strings.add("Alex");
        strings.add("Stas");
        strings.add("Ken");
        strings.add("Baby");
        System.out.println(strings.size());


        String[] name = new String[]{"bob", "kris", "fas", "dod", "nab", "kola", "alex", "ken",
                "s", "d", "f", "z", "w", "d", "s", "e", "r", "t", "y", "u"};
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(name));
        System.out.println(nameList.toString());
        System.out.println();

        System.out.println("nameList.get(1) = " + nameList.get(0));
        System.out.println("nameList.get(nameList.size()-1) = " + nameList.get(nameList.size() - 1));
        System.out.println();


        System.out.println("Adding five elements in sequence");
        nameList.add("grey");
        nameList.add("green");
        nameList.add("Sam");
        nameList.add("Billy");
        nameList.add("Jon");
        System.out.println(nameList.toString());
        System.out.println();

        System.out.println("Adding sixth element in third positions and seventh in first positions");
        nameList.add(3, "six");
        nameList.add(0, "seven");
        System.out.println("nameList.toString() = " + nameList.toString());
        System.out.println();


        System.out.println("Deleting elements");
        System.out.println("nameList.remove(3) = " + nameList.remove(3));
        System.out.println("nameList.remove(\"seven\") = " + nameList.remove("seven"));
        nameList.trimToSize();
        System.out.println(nameList.toString());
        System.out.println("nameList.contains(\"seven\") = " + nameList.contains("seven"));
        System.out.println();


        System.out.println("Create new Array Integer");
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(6);
        integers.add(9);
        integers.add(23);
        integers.add(27);
        integers.add(1);
        integers.add(65);
        integers.add(74);
        integers.add(2);
        integers.add(8);
        integers.add(5);
        integers.add(9);
        integers.add(88);
        integers.add(9);
        integers.add(33);
        System.out.println("integers.toString() = " + integers.toString());
        System.out.println();


        ArrayList<Integer> newElements = new ArrayList<>();
        System.out.println("Элементы массива которые делятся на 3");
        for (int i : integers
        ) {
            if (i % 3 == 0) {
                newElements.add(i);

            }
            System.out.println(newElements.toString());

        }
        System.out.println();
        System.out.print("Выводим индексы которые делятся на (3)");
        for (int i = 0; i < integers.size(); i++) {
            if (i % 3 == 0) {

                System.out.print(" :" + i);
            }
        }
        System.out.println();
        int count = 0;
        System.out.print("Возвращаем количество элементов равных (5)");
        for (Integer integer : integers) {
            if (integer.equals(5)) {
                count++;
            }
        }
        System.out.println(":" + count);

        System.out.println();
        System.out.println(integers.toString());
        System.out.print("Missing first three elements");
        for (int i = 3; i < integers.size(); i++) {

            System.out.print(", " + integers.get(i));
        }


        System.out.println();
        int count1 = 0;
        System.out.println("Missing first three elements equals 9");
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i).equals(9)) {
                count1++;
                if (count1 > 2) {
                    System.out.println(integers.get(i));
                }
            }
        }
        System.out.println();

        Person bob = new Person("Bob", "man", 55);
        Person jac = new Person("Jac", "man", 22);
        Person hugo = new Person("Hugo", "man", 18);
        Person halter = new Person("Halter", "man", 27);
        Person alex = new Person("Alex", "man", 30);
        Person any = new Person("Any", "woman", 15);
        Person lola = new Person("Lola", "woman", 60);
        Person jany = new Person("Jany", "woman", 18);

        ArrayList<Person> list = new ArrayList<Person>();
        list.add(bob);
        list.add(jac);
        list.add(hugo);
        list.add(halter);
        list.add(alex);
        list.add(any);
        list.add(lola);
        list.add(jany);
        System.out.println(list.toString());







//
//        System.out.print("First element which can / (3): ");
//        integers.trimToSize();
//        for (int i : integers
//        ) {
//            if (i % 3 == 0) {
//                intWithoutTwoElem.add(i);
//            }
//            for (int j = 2; j < intWithoutTwoElem.size() ; j++) {
//                System.out.println(i);
//            }
//        }


    }
}
