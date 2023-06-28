package com.mycompany.oop;

abstract public class Animal {

    public boolean mammals;
    public boolean carnivorous;
    public boolean mood_happy;
    public boolean mood_scare;

    public Animal(boolean mammals, boolean carnivorous, boolean mood_happy, boolean mood_scare) {
        this.mammals = mammals;
        this.carnivorous = carnivorous;
        this.mood_happy = mood_happy;
        this.mood_scare = mood_scare;
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

    public boolean isMood_happy() {
        return mood_happy;
    }

    public boolean isMood_scare() {
        return mood_scare;
    }

    public void SayHello() {
    }

    public void SayHello(int x) {
    }
}
