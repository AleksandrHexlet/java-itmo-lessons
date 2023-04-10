package ru.itmo.lessons.lesson07.school;

public class Headmaster implements ILearn{
    public  void invite(Person person){
        System.out.println("Диретор вызвал: " + person.getName());
    }

    @Override
    public void defaultLearning() {
        ILearn.super.defaultLearning();
    }

    @Override
    public void learn(int level) {
        System.out.println("Директор посетил урок "+ ". Уровень знаний преподователя " + level);
    }
}
