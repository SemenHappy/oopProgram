package com.HomeWorkInterface;

public class Person implements Learnable,SuperMan {
    @Override
    public void superAbility() {
        System.out.println("I can fly, if i very angry");
    }

    @Override
    public void learn() {
        System.out.println("I can learn everything");
    }

    public static void main(String[] args) {
        Learnable bob = new Person();
        bob.learn();
        SuperMan jak = new Person();
        jak.superAbility();
    }
}
