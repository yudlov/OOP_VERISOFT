package com.mycompany.oop;

abstract class Animal {

    private boolean mammals;
    private boolean carnivorous;
    private int mood_happy;
    private int mood_scare;
    private int mood;

    public Animal(boolean mammals, boolean carnivorous, int mood_happy, int mood_scare, int mood) {
        this.mammals = mammals;
        this.carnivorous = carnivorous;
        this.mood_happy = mood_happy;
        this.mood_scare = mood_scare;
        this.mood = mood;
    }

    public void setMammals(boolean mammals) {
        this.mammals = mammals;
    }

    public void setCarnivorous(boolean carnivorous) {
        this.carnivorous = carnivorous;
    }

    public boolean isCarnivorous() {
        return carnivorous;
    }

    public boolean isMammals() {
        return mammals;
    }

    public void SayHello() {
    }

    public void SayHello(int x) {
        this.mood = x;
    }

}
