package ru.home.java.homework;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {
        if (food > 0) {
            food -= amount;
        } else {
            System.out.println("Кот не может съесть больше чем в тарелке есть еды, добавим еды");
        }
    }

    public void addFood(int amount) {
        food += amount;
    }

    public void info() {
        System.out.printf("Plate [ Food: %d ]\n", food);
    }
}
