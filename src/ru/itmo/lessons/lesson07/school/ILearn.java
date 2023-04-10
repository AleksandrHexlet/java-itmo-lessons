package ru.itmo.lessons.lesson07.school;

public interface ILearn {

    default public void defaultLearning(){ // обычный метод и его можно переопределить в имплементированном (дочернем ) классе
        System.out.println("Обучение....");
    }
    public void learn(int level);

}
