package ru.home.java.homework;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public int getAppetite() {
        return appetite;
    }

    public Cat(String name) {
        this.name = name;
        this.appetite = 5;
        this.hungry = true;
    }

    public void info() {
        System.out.println(name + " " + hungry);
    }

    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite)) {
            hungry = false;
            System.out.println(name + " покушал");
        } else {
            System.out.println("Недостаточно еды в тарелке");
        }
    }
}
