/*
 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения,
 которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java.
 */
package seminar6.lesson;

import java.util.ArrayList;
import java.util.List;

public class Cat {
    private String name;
    private String breed;
    private String owner;
    private List<Award> awards;
    
    public Cat(String name, String breed, String owner) {
        this.name = name;
        this.breed = breed;
        this.owner = owner;
        this.awards = new ArrayList<>();
    }

    public void addAwards(Award award) {
        this.awards.add(award);
    }

}
