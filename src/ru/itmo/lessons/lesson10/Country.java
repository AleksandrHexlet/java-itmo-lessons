package ru.itmo.lessons.lesson10;

public enum Country {
    UK,USA,FRANCE

    // это три final static (константы) обьекта с типом данных Country. Они в единичном экземпляре в памяти.
    // Их нельзя удалять, менять местами и изменять
}

/*
public class Article{

private Country country;
public enum Country {
    UK,USA,FRANCE
}


доступ к перечислению, если оно обьявлено внутри класса такое:
Article.Country.UK

}
 */