package com.mycompany.oop;

public class Dog extends Animal implements Land {

    public int NumOfLegs;
    public Animal Dog;

    public Dog(int NumOfLegs, Animal Dog, boolean mammals, boolean carnivorous, int mood_happy, int mood_scare, int mood) {
        super(mammals, carnivorous, mood_happy, mood_scare, mood);
        this.NumOfLegs = NumOfLegs;
        this.Dog = Dog;
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
