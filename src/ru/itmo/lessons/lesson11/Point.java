package ru.itmo.lessons.lesson11;

import java.util.Objects;

public class Point implements Cloneable{
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
//    при вызове метода клон родителя(super.clone()) необходимо implements Cloneable иначе будет CloneNotSupportedException
    @Override
    public  /*protected*/  Point/*Object */ clone() throws CloneNotSupportedException {
       try{
           return (Point) super.clone();
       } catch (CloneNotSupportedException exception){
           System.out.println("Клонирование не поддерживается");
           return  null;
        }

    }
}