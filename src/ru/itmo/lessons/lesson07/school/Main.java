package ru.itmo.lessons.lesson07.school;

public class Main {
    public static void main(String[] args) {
        Student student01 = new Student("Марк", "химия");
        student01.setAge(12);
        Teacher teacher01 = new Teacher("биология", 10, "Елена Олеговна");
        teacher01.setAge(30);

        // Person person = new Person(); - ошибка, тк Person - абстрактный
        Person student02 = new Student("Иван", "астрономия");
        Person teacher02 = new Teacher("астрономия", 14, "Григорий Петрович");
        // для вызова доступны только методы и свойства,
        // объявленные в классе Person
        // если методы были переопределны в дочерних классах,
        // то при вызове будет использоваться их реализация
        student02.setAge(8);
        teacher02.setAge(46);

        student02.rest();
        teacher02.rest();

        // общий тип данных используется для хранения объектов
        // в массивах, коллекциях и т.д.
        Person[] people = {student01, student02, teacher01, teacher02};
        for (Person person : people) {
            person.rest();
            if (person instanceof Student){ // instanceof вернет true если person принадлежит к типу Student
                ((Student)person).getSubject(); // это аналогично коду на следующей строке
                Student student = (Student) person;
                student.getSubject();
                System.out.println(((Student)person).getSubject());
            }
        }



        //Если тип данных Person значит для вызова доступны только методы и свойства обьявленные в классе Person
//  если в дочерних классах были переопределены методы обьявленные в классе Person, то при вызове экземпляра
//  класса student02 и teacher02 будет использоваться логика которая переопределена в дочернем классе

        // мы создаём экземпляры классов через общий тип данных для того, чтобы хранить их в одной коллекции,массиве и т.д.
        // при этом у нас доступна реализация методов определенная в дочерних классах

        // общий тип данных используется для передачи объектов в методы
 Headmaster headmaster = new Headmaster();
        headmaster.invite(student01);
        headmaster.invite(student02);
        headmaster.invite(teacher01);
        headmaster.invite(teacher02);
teacher01.teach(student01);
teacher01.teach(headmaster);

    }
}
