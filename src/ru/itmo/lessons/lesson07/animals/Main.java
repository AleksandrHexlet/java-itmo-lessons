package ru.itmo.lessons.lesson07.animals;

public class Main {
    public static void main(String[] args) {
        Mouse mouse01 = Mouse.getMouse();
        Cat cat01 = new Cat(12,67,30);
        Cat cat02 = new Cat(18,55, 50);
        cat02.setName("Рыжик");
    }
}
