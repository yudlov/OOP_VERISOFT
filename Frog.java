package com.mycompany.oop;

class Frog extends Animal implements Water {

    public int NumOfLegs;
    public Animal Frog;

    public Frog(int NumOfLegs, Animal Frog, boolean mammals, boolean carnivorous, int mood_happy, int mood_scare, int mood) {
        super(mammals, carnivorous, mood_happy, mood_scare, mood);
        this.NumOfLegs = NumOfLegs;
        this.Frog = Frog;
    }

    @Override
    public boolean HasGills() {
        if (this.HasGills() == true) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean HasLaysEggs() {
        if (this.HasLaysEggs() == true) {
            return true;
        } else {
            return false;
        }
    }

}
