package ru.home.java.homework;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void addFood(int amount) {
        food += amount;
    }

    public void info() {
        System.out.printf("Plate [ Food: %d ]\n", food);
    }
}
