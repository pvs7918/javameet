/*
Напишите метод, который наход самую длинную строку
общего префикса среди массива строк.
Если нет общ.префикса вернуть ""
 */

package seminar1.lesson;

//import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        // Массив строк
        String sta[] = new String[3];
        sta[0] ="Первая строка";
        sta[1] ="Персик";
        sta[2] ="Перископ";
        

        //Выводим исходный массив строк
        System.out.println("Исходный массив строк:");
        for (int i=0; i<sta.length;i++) {
            System.out.printf("%s \n", sta[i]);
        }
        System.out.println();

        //Выводим общий префикс
        System.out.printf("Общий префикс: %s ", FindCommonPref(sta));

    }    
            
    public static String FindCommonPref(String[] sta) {
        int min_len = -1;
        String pref = "";
        char cur_char = '0';
        boolean char_matching = false;
        
        for (int i=0; i<sta.length;i++) {
            //определяем длину наименьшей строки
            if (min_len < 0 || (min_len > 0  && sta[i].length() < min_len)) {
                min_len = sta[i].length();
            }
        }

        //признак совпадения текущего символа во всех строках: инициализация перед сверкой
        //продолжаем поиск до первого несовпадения символа, 
        //либо пока не закончится одна из строк
        char_matching = true;
        for (int j=0; j<min_len;j++) { //для каждого символа строк
            for (int i=0; i<sta.length;i++) { //для каждой строки
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
