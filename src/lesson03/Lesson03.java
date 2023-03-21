package lesson03;

import java.util.Scanner;

public class Lesson03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число тарелок");
        int platesNumber = scanner.nextInt();

        System.out.println("Введите количество порций моющего средства");
        double amountDetergent = scanner.nextDouble();

        while(platesNumber > 0 && amountDetergent >= 0.5) {
            platesNumber = --platesNumber;
            amountDetergent = amountDetergent - 0.5;
            System.out.println("Введите количество порций моющего средства равно: " + amountDetergent );
        }
        System.out.println("количество тарелок = " + platesNumber + "  количество порций моющего средства после мойки тарелок = " + amountDetergent);

        for (int i = 30; i >= 0; i= i-5) {
            System.out.println("Число равно = " + i);

        }

    }


}
