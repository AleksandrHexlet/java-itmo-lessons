package ru.itmo.lessons.lesson07.animals;

public class AppUtils {
    // метод принимает на вход два числа и  возвращает минимальное
    // метод принимает на вход два числа (min, max) и  возвращает случайное от min до  max
    // метод принимает на вход две строки  и и возвращает наименьшую по длине

    public int getMinNumber(int firstNum, int secondNum){

        return firstNum > secondNum ? firstNum : secondNum;
    }


    public int getRandomNumber(int minNum, int maxNum){
        int res = (int) ((Math.random() * (maxNum - minNum)) + minNum);
        return res;
    }

    public String getMinLengthStr(String firstStr, String secondStr){

        return firstStr.length() > secondStr.length() ? firstStr : secondStr;
    }

}
