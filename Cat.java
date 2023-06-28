package com.mycompany.oop;

class Cat extends Animal implements Land {

    public int NumOfLegs;
    public Animal Cat;

    public Cat(int NumOfLegs, Animal Cat, boolean mammals, boolean carnivorous, boolean mood_happy, boolean mood_scare) {
        super(mammals, carnivorous, mood_happy, mood_scare);
        this.NumOfLegs = NumOfLegs;
        this.Cat = Cat;
    }

    @Override
    public boolean isMood_happy() {
        if (this.mood_happy == true) {
            System.out.println("purr, purr");
        }
        return false;

    }

    @Override
    public boolean isMood_scare() {
        if (this.isMood_scare() == true) {
            System.out.println("hissing");
        }
        return false;
    }

    @Override
    public void SayHello() {
        System.out.println("MEOW");
    }

    @Override
    public void SayHello(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println("MEOW");
        }
    }

    @Override
    public int GetNumOfLegs() {
        if (this.GetNumOfLegs() >= 2) {
            return 2;
        } else {
            return 4;
        }
    }

}
