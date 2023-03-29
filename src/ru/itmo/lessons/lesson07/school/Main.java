package ru.itmo.lessons.lesson07.school;

public class Main {
    public static void main(String[] args) {
        Student student01 = new Student("Ivan","English");
        student01.age = 25;
        System.out.println(student01.getName() + "; age = " + student01.age + "; subj = " + student01.getSubject());

    }
}
