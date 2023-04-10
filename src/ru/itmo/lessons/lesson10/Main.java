package ru.itmo.lessons.lesson10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Country country01 = Country.UK;
        Country country02 = Country.UK;
        //можно перечисления сравнивать через == и через equals

        System.out.println(country01 == country02); // true так как ссылка на один обьект
        System.out.println(country01 == Country.UK); // true так как ссылка на один обьект
        System.out.println(country01 == Country.USA); // false так как ссылка на разные обьект

        Article article01 = new Article("Путешевствие по Британии");

        System.out.println(article01.getCountry()); // так как обьект ссылочный и по умолчанию у ссылочного типа значение null
        article01.setCountry(Country.UK);
        System.out.println(article01.getCountry() == country01); // true так как ссылка на один обьект (константу)
        article01.setCountry(Country.FRANCE);


        // Методы enum
        // получение массива констант

        Country[] countries = Country.values();
        System.out.println(Arrays.toString(countries));

        // индекс элементов перечисления в массиве

        System.out.println(Country.FRANCE.ordinal()); // индекс 2
        System.out.println(article01.getCountry().ordinal()); // индекс 2

        for (Country country : countries) {
            // методы name и toStringпо умолчанию вернут одно и тоже
            // вернут строковое представление обьектов
            // Но метод name нельзя переопределить
            // а метод  toString можно переопределить
            System.out.println(country.name());
            System.out.println(country.toString());
        }
// методы equals, hashcode, clone нельзя переопределять в перечислениях
        System.out.println(Priority.HICH.getCode());
        Priority priority = Priority.MEDIUM;
        System.out.println(priority.getCode());
        Priority[] priorities = Priority.values();
        for (Priority priorityElem : priorities) { //iter
            System.out.println(priorityElem.getCode());
        }

    }
}
