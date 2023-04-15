package ru.itmo.lessons.lesson14.task.task03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private String name;
    private String company;
    private int salary;
    private int age;

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    // TODO: добавить необходимые конструкторы, геттеры, сеттеры и другие методы


    // TODO: дописать реализацию метода для создания списка объектов класса Employee.
    //  Объекты Employee создавать со случайными значениями:
    //  возраст от 21 до 60;
    //  диапазон ЗП на Ваш выбор.
    //  name - случайное значения из массива names
    //  company - случайное значения из массива companies
    public static List<Employee> employeeGenerator(int num) { //  num - количество объектов в списке
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний

        ArrayList<Employee> employees = new ArrayList<>();

        // создание объектов, наполнение списка

        return employees;
    }

    // 2.1. по имени
    // 2.2. по имени и зп
    // 2.3. по имени, зп, возрасту, компании
    public static class nameComparator implements Comparator<Employee>{

        @Override
        public int compare(Employee o1, Employee o2) {
            return o2.getName().compareTo(o1.getName());
        }
    }

    public static class salaryComparator implements Comparator<Employee>{

        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (o2.getSalary() - o1.getSalary());
        }
    }

    public static class ageComparator implements Comparator<Employee>{

        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (o2.getAge() - o1.getAge());
        }
    }

    public static class companyComparator implements Comparator<Employee>{

        @Override
        public int compare(Employee o1, Employee o2) {
            return o2.getCompany().compareTo(o1.getCompany());
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}