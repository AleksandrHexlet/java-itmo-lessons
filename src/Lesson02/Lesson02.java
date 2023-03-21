package Lesson02;

public class Lesson02 {
    public static void main(String[] args) {
        // использование var возможно только  начиная с Java 10
        var version = 10; // int
        var bigNumber = 10L; // long
        var connected = true; // boolean
        var balance = 4000.8; // double
        var weight = 50.5F; // float
        var price = (short) 290; // short

        int sum01 = 999999;
        double discount = sum01 / 10;
        double res = sum01 > 100_000 ? sum01 * 0.9 : sum01 ;
        System.out.println("сумма покупки равна: " + res);

        int age = 25;
        int expirience = 5;



        if ( age < 18 || age > 200) {
            System.out.println("Мы вам перезвоним");
        } else if ( expirience >= 5) {
            System.out.println("Вы подходите на должность страшего разработчика");
        } else if ( expirience > 0 ) {
            System.out.println("Вы подходите на должность младшего разработчика");
        } else {
            System.out.println("Вы ввели не верные данные");
        }
    }
}
