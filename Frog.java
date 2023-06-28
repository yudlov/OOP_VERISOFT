package com.mycompany.oop;

class Frog extends Animal implements Water, Land {

    public int NumOfLegs;
    public Animal Frog;

    public Frog(int NumOfLegs, Animal Frog, boolean mammals, boolean carnivorous, boolean mood_happy, boolean mood_scare) {
        super(mammals, carnivorous, mood_happy, mood_scare);
        this.NumOfLegs = NumOfLegs;
        this.Frog = Frog;
    }

    @Override
    public boolean HasGills() {
        return this.HasGills() == true;
    }

    @Override
    public boolean HasLaysEggs() {
        return this.HasLaysEggs() == true;
    }

    @Override
    public int GetNumOfLegs() {
        if (this.GetNumOfLegs() < 2) {
            return 4;
        } else {
            return 2;
        }
    }

    @Override
    public void SayHello(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println("fog says hello ");
        }
    }

    @Override
    public boolean isMood_happy() {
        if (this.mood_happy == true) {
            System.out.println("quack quack quack");
        }
        return false;

    }

    @Override
    public boolean isMood_scare() {
        if (this.isMood_scare() == true) {
            System.out.println("plop into the water");
        }
        return false;
    }
}
