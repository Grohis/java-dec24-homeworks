package ru.otus.java.basic.homeworks.homeworks12;

public class Plate {
    protected int maxFood;
    protected int currentFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }

    public void addFood(int amount) {
        currentFood = Math.min(maxFood, currentFood + amount);
    }

    public boolean decreaseFood(int amount) {
        if (currentFood >= amount) {
            currentFood -= amount;
            return true;
        }
        return false;
    }

    public int getCurrentFood() {
        return currentFood;
    }
}
