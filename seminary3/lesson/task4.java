/*
 * Задача 4. Каталог товаров книжного магазина сохранен в виде двумерного списка
 * List<ArrayList<String>> так,
 * что на 0й позиции каждого внутреннего списка содержится название жанра,
 * а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры.


 */
package seminary3.lesson;

import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class task4 {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> bookStore = new ArrayList<>();
        
        ArrayList<String> action = new ArrayList<>();
        ArrayList<String> fantsy = new ArrayList<>();

        action.add("Экшн");
        action.add("Экшн Книга :))");
        action.add("Еще одна экшн Книга :))");

        fantsy.add("Фантаскика");
        fantsy.add("Фантастическая книга");
        fantsy.add("Фантастическая книга2: None");

        bookStore.add(action);
        bookStore.add(fantsy);

        System.out.println(bookStore);
    }

    }
    
}
