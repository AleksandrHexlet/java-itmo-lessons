package ru.itmo.lessons.lesson07.animals;

public class Cat {
    private String name;
    private final int weight;
    private final int speed;
    private final Mouse[] mouseArr;
    private int index;
    private int winner;

    public Cat(int weight, int speed, int arrLength) {
        if (speed < 10) {
            throw new IllegalArgumentException("speed < 10");
        }
        if (weight < 5) {
            throw new IllegalArgumentException("weight < 5 ");
        }
        this.weight = weight;
        this.speed = speed;
        mouseArr = new Mouse[arrLength];
    }

    public void setName(String name) {
        this.name = name;
    }

    public void catchMouse(Mouse mouse) {
        if (mouse == null) {
            System.out.println("Кот ловит только мышей");
        }
        if (speed <= mouse.getSpeed()) {
            System.out.println(name + " не смог догнать мышь");
            return;
        }
        if (index < mouseArr.length) {
            mouseArr[index] = mouse;
            index++;
        } else {
            System.out.println("В массиве нет места. Кот поймал достаточное количество мышей");
        }
    }
    public void isWinnerCat( Cat enemy){
        if(enemy == this){ // проверяем, что ссылки не ведут на один и тот же обьект
            System.out.println("Кот может напасть на самого себя");
            return;
        }
        if(enemy == null){
            System.out.println("Кот может напасть только на кота");
            return;
        }
        if(weight > enemy.weight){
            winner++;
        } else{
            enemy.winner++;
        }
    }

    public static Cat getCat(){
        Cat cat = new Cat((int) (Math.random()* 30),(int) (Math.random()* 50), 100);
        return cat;

    }
}
