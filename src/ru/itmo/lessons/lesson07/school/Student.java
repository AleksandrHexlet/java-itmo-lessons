package ru.itmo.lessons.lesson07.school;

public class Student extends Person {
    private String subject; // изучаемый предмет
    private int level;     // уровень знаний

    public Student(String name,String subject) {
        super(name);
        setSubject(subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        if(subject == null || subject.length() < 2 ){
            throw  new IllegalArgumentException("Exeption.age < 0");
        }
        this.subject = subject;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
