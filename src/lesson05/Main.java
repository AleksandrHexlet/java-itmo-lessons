package lesson05;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // массивы
        int[] codes = {123, 456, 789, 999};
        int randomIndex = (int) (Math.random() * codes.length);

//        System.out.println("randomIndex = " + randomIndex);
//        System.out.println("codes = " + codes[randomIndex]);
//
//
//        for (int i = 0; i < codes.length; i++) {
//            System.out.println(codes[i]);
//            if(codes[i] > 900) codes[i] += 9000;
//            System.out.println(Arrays.toString(codes));
//            for (int code : codes) {
//                System.out.println(code);
//            }

        int[] ints01 = new int[12];
        String[] colors = new String[15];
        String[] clrs = {"red", "green", "blue", "orange", "grey"};

        for (int i = 0; i < clrs.length - 1; i++) {
            colors[i] = clrs[i];
        }

        for (int i = 0; i < ints01.length - 1; i++) {
            ints01[i] = (int) (Math.random() * 30);
            if (colors[i] == "red") System.out.println("we find red color. colors[i] = " + colors[i]);
        }

               for (String color : colors) {
                if (color != null && color.equals("red")) System.out.println("RED !!!");
                break;
            }

        System.out.println("colors = " + Arrays.toString(colors));


        // методы для работы с массивами
        double[] temps = {45.7, 22.9, 12.0, 33.8, 98.1};


// СОРТИРОВКА
        Arrays.sort(temps); // метод меняет исходный массив
        System.out.println(Arrays.toString(temps));
// БИНАРНЫЙ ПОИСК. Если элемент в массиве найден, тогда вернется игдекс элемента в массиве, если нет, тогда вернет -1
        System.out.println(Arrays.binarySearch(temps, 98.1)); //
// СОЗДАНИЕ КОПИЙ
// 1) Позволяет сделать полную копию массива
        double[] newTemps01 = temps.clone();
        System.out.println(Arrays.toString(newTemps01));
// 2) Позволяет скопировать несколько первых элементов массива или сделать полную копию массива
       double[] newTemps02 = Arrays.copyOf(temps, 3);
        System.out.println(Arrays.toString(newTemps02));
// 3)

        //   System.arraycopy(Object src, int srcPos, Object dst, int dstPos, int len)
        // Метод копирует len элементов массива src, начиная с позиции srcPos, в массив dst, начиная с позиции dstPos.
        // Массив dst должен иметь достаточный размер, чтобы в нем поместились все копируемые элементы.
        double[] newTemps03 = new double[30];
        System.arraycopy(temps, 0, newTemps03, 10, temps.length);

        System.out.println(Arrays.toString(newTemps03));
    }
}

