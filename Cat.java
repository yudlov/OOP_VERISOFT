package com.mycompany.oop;

class Cat extends Animal implements Land {

    public int NumOfLegs;
    public Animal Cat;

    public Cat(int NumOfLegs, Animal Cat, boolean mammals, boolean carnivorous, int mood_happy, int mood_scare, int mood) {
        super(mammals, carnivorous, mood_happy, mood_scare, mood);
        this.NumOfLegs = NumOfLegs;
        this.Cat = Cat;
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
