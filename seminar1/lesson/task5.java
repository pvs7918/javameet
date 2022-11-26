/*
Задача №5
ВО фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке
 */

package seminar1.lesson;

//import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        // Массив строк
        String srcstr = "Добро пожаловать на курс по Java";
        String sa[] = srcstr.split(" ");

        // Выводим исходный массив строк
        System.out.println("Исходный массив строк:");
        for (int i = 0; i < sa.length; i++) {
            System.out.printf("%s \n", sa[i]);
        }
        System.out.println();

        // переставляем слова
        for (int i = 0; i < sa.length / 2; i++) {
            String tmp = sa[i];
            sa[i] = sa[sa.length - 1 - i];
            sa[sa.length - 1 - i] = tmp;
        }
        System.out.println();

        // Выводим результат
        System.out.println("Результирующий массив строк:");
        for (int i = 0; i < sa.length; i++) {
            System.out.printf("%s \n", sa[i]);
        }

    }

    public static String FindCommonPref(String[] sta) {
        int min_len = -1;
        String pref = "";
        char cur_char = '0';
        boolean char_matching = false;

        for (int i = 0; i < sta.length; i++) {
            // определяем длину наименьшей строки
            if (min_len < 0 || (min_len > 0 && sta[i].length() < min_len)) {
                min_len = sta[i].length();
            }
        }

        // признак совпадения текущего символа во всех строках: инициализация перед
        // сверкой
        // продолжаем поиск до первого несовпадения символа,
        // либо пока не закончится одна из строк
        char_matching = true;
        for (int j = 0; j < min_len; j++) { // для каждого символа строк
            for (int i = 0; i < sta.length; i++) { // для каждой строки
                if (i == 0) {
                    cur_char = sta[0].charAt(j);
                } else {
                    if (sta[i].charAt(j) != cur_char) {
                        char_matching = false;
                    }
                }
            }
            if (char_matching == true) {
                pref += cur_char;
            }
        }
        return pref;
    }
}
