package ru.itmo.lessons.lesson07.animals;

public class Mouse {
    private int speed;
    private  String Color;
    public Mouse(int speed) {
        if (speed < 5) {
            throw new IllegalArgumentException("speed < 15");
        }
        this.speed = speed;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getSpeed() {
        return speed;
    }


    public  static Mouse getMouse(){
        String[] colors = {"черный", "серый", "белый"};
        Mouse mouse = new Mouse((int)(Math.random() *40 ) + 10); // случайное значение от 10 до 50;
        mouse.setColor(colors[(int) (Math.random()* colors.length)]);
        
        return mouse;
    }


}
