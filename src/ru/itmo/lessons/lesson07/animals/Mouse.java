package ru.itmo.lessons.lesson07.animals;

public class Mouse {
    private int speed;
    public Mouse(int speed) {
        if (speed < 5) {
            throw new IllegalArgumentException("speed < 15");
        }
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
