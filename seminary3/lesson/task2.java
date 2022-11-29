/*
 * Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
Вывести название каждой планеты и количество его повторений в списке.
2.2 Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.


 */
package seminary3.lesson;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        
        ArrayList<String> plnts = new ArrayList<>();
        plnts.add("Меркурий");
        plnts.add("Венера");
        plnts.add("Земля");
        plnts.add("Марс");
        plnts.add("Юпитер");
        plnts.add("Сатурн");
        plnts.add("Уран");
        plnts.add("Нептун");
        
        int N = 20;
        ArrayList<String> ls2 = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            ls2.add(plnts.get(new Random().nextInt(plnts.size())));
        }
        System.out.println(ls2);

        for (int i = 0; i < ls2.size()-1; i++) {
            for (int j = i + 1; j < ls2.size(); j++) {
                if(ls2.get(i).equals(ls2.get(j))) {
                    ls2.remove(j);
                    j--;
                }
            }
        }
        
        System.out.println(ls2);

    }
}
