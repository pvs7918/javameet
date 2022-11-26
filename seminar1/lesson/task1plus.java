/*
 * вывести привествие по времени суток и запрашиваемому имени
 */
package seminar1.lesson;

import java.time.LocalTime;
import java.util.Scanner;

public class task1plus {
    public static void main(String[] args) {
        String s = null;
        // текущий час
        int cur_hour = LocalTime.now().getHour();
        // ввод имени
        System.out.print("Введите имя: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        if (cur_hour >= 5 && cur_hour < 12) {
            s = "Доброе утро";
        } else if (cur_hour >= 12 && cur_hour < 18) {
            s = "Добрый день";
        } else if (cur_hour >= 18 && cur_hour < 23) {
            s = "Добрый вечер";
        } else {
            s = "Доброй ночи";
        }
        //System.out.println(s);
        //System.out.println(name);
        System.out.printf("%s, %s!", s, name);
        sc.close();
//20:01
    }
}
