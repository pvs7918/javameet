/*
 * Задача 3. Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа. 
Пройти по списку, найти и удалить целые числа.

 */
package seminar3.lesson;

import java.util.ArrayList;
//import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        ArrayList<String> ls = new ArrayList<>();
        ls.add("первый");
        ls.add("2");
        ls.add("третий");
        System.out.println(ls);

        for (int i = 0; i< ls.size();i++) {
            Object c = ls.get(i);
            if (c instanceof Integer) {
                ls.remove(i);
            }
        }
        System.out.println(ls);
    }
}
