package ru.itmo.lessons.lesson14.task.task03;

import ru.itmo.lessons.lesson14.task.task01.Fruit;

import java.util.*;

public class Task03 {
    public static void main(String[] args) {
        // 1. Дописать класс Employee
        List<Employee> employeeList = Employee.employeeGenerator(20);

        // 2. Отсортировать employeeList:
        // 2.1. по имени
        // 2.2. по имени и зп
        // 2.3. по имени, зп, возрасту, компании

        // Для сортировки используйте тип Comparator
        Comparator<Employee> comparatorName = new Employee.nameComparator();
        Comparator<Employee> comparatorNameAndSalary = new Employee.nameComparator().thenComparing(new Employee.salaryComparator());
        Comparator<Employee> comparatorNameSalaryAge = comparatorNameAndSalary.thenComparing(new Employee.ageComparator());
        Comparator<Employee> comparatorNameSalaryAgeCompany = comparatorNameSalaryAge.thenComparing(new Employee.companyComparator());

//        ArrayList<Employee> arrayName = new ArrayList<>( comparatorName);
//        ArrayList<Employee> arrayNameSalary = new ArrayList<>( comparatorNameAndSalary);
//        ArrayList<Employee> arrayNameSalaryAgeCompany = new ArrayList<>(comparatorNameSalaryAgeCompany);

//        for (Employee item: employeeList){
//            arrayName.add(item);
//            arrayNameSalary.add(item);
//            arrayNameSalaryAgeCompany.add(item);
//        }

//        System.out.println("arrayName =  " + arrayName);
//        System.out.println(" arrayNameSalary = " +  arrayNameSalary);
//        System.out.println("arrayNameSalaryAgeCompany =  " + arrayNameSalaryAgeCompany );


    }


}
//
//    Comparator<Fruit> fruitComparator = new Fruit.PriceComparator().thenComparing(new Fruit.NameComparator());
//    TreeSet<Fruit> fruitTreeSet = new TreeSet<>(fruitComparator); // создано пустое множество, порядок сортировки

