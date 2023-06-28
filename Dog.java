package com.mycompany.oop;

public class Dog extends Animal implements Land {

    public int NumOfLegs;
    public Animal Dog;

    public Dog(int NumOfLegs, Animal Dog, boolean mammals, boolean carnivorous, boolean mood_happy, boolean mood_scare) {
        super(mammals, carnivorous, mood_happy, mood_scare);
        this.NumOfLegs = NumOfLegs;
        this.Dog = Dog;
    }

    @Override
    public boolean isMood_happy() {
        if (this.mood_happy == true) {
            System.out.println("barking loudly");
        }
        return false;

    }

    @Override
    public boolean isMood_scare() {
        if (this.isMood_scare() == true) {
            System.out.println("whooping");
        }
        return false;
    }

    @Override
    public int GetNumOfLegs() {
        if (this.GetNumOfLegs() >= 2) {
            return 2;
        } else {
            return 4;
        }
    }

    @Override
    public void SayHello() {
        System.out.println("wagging the tail");
    }

    @Override
    public void SayHello(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println("wagging the tail");
        }
    }

}
