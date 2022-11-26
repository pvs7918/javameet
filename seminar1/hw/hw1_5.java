/*
4.	*+Задано уравнение вида q + w = e. При q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса,
например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет.
* */

package seminar1.hw;

import java.util.Scanner;

public class hw1_5 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //Ввод переменных q, w, e
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значения двузначных чисел q,w,e. Используйте ? для неизвестных цифр). Введите q для выхода.");
        //Ввод значения q
        String q = "";
        //проверяем корректность введенного значения q
        do {
            System.out.printf("Введите значение переменной q: ");
            q = sc.nextLine().toUpperCase();
            if (q.equals("Q")) {
                System.out.println("Выполнение программы прервано!");
                return;
            }
        } while(!CheckNumber(q));
        

        //Ввод значения w
        String w = "";
        //проверяем корректность введенного значения w
        do {
            System.out.printf("Введите значение переменной w: ");
            w = sc.nextLine().toUpperCase();
            if (w.equals("Q")) {
                System.out.println("Выполнение программы прервано!");
                return;
            }
        } while(!CheckNumber(w));

        //Ввод значения e
        String e = "";
        //проверяем корректность введенного значения e. e -может быть только числом
        do {
            System.out.printf("Введите значение переменной e: ");
            e = sc.nextLine().toUpperCase();
            if (e.equals("Q")) {
                System.out.println("Выполнение программы прервано!");
                return;
            }
        } while(!CheckNumber_2(e));

        //Выводим выражение
        System.out.println("Уравнение:");
        System.out.printf("%s + %s = %s\n", q, w, e);

        //выделяем цифры в числах
        String q0 = Character.toString(q.charAt(0));
        String q1 = Character.toString(q.charAt(1));
        String w0 = Character.toString(w.charAt(0));
        String w1 = Character.toString(w.charAt(1));
        String e0 = Character.toString(e.charAt(0));
        String e1 = Character.toString(e.charAt(1));
        //признак наличия решения
        boolean itsCanToDecide = true;

        //находим неизвестные цифры в числах - ?
        //сначала вычисляем неизвестные единицы
        if (q1.equals("?")) {
            if (w1.equals("?")) {
                // q1 и w1 равны ? .поэтому берем q1 = 1 (в данном случае это допустимо), 
                // чтобы найти хотя бы одно решение
                q1 = "1";
                w1 = Integer.toString(Integer.parseInt(e1) - Integer.parseInt(q1));
                if (Integer.parseInt(w1)<0) {
                    w1 = Integer.toString(Integer.parseInt(w1) + 10);
                    e0 = Integer.toString(Integer.parseInt(e0) - 1);
                }
            } else {
                // q1 - ?, w1 - число
                q1 = Integer.toString(Integer.parseInt(e1) - Integer.parseInt(w1));
                if (Integer.parseInt(q1)<0) {
                    q1 = Integer.toString(Integer.parseInt(q1) + 10);
                    e0 = Integer.toString(Integer.parseInt(e0) - 1);
                }
            }
        } else {
            if (w1.equals("?")) {
                // q1 - число, w1 - ?
                w1 = Integer.toString(Integer.parseInt(e1) - Integer.parseInt(q1));
                if (Integer.parseInt(w1)<0) {
                    w1 = Integer.toString(Integer.parseInt(w1) + 10);
                    e0 = Integer.toString(Integer.parseInt(e0) - 1);
                }
            } else {
                // q1 - число, w1 - число
            }
        }
        
        //теперь вычисляем неизвестные десятки
        if (q0.equals("?")) {
            if (w0.equals("?")) {
                // q1 и w1 равны ? .поэтому берем q0 = 1, чтобы найти хотя бы одно решение
                q0 = "1";
                w0 = Integer.toString(Integer.parseInt(e0) - Integer.parseInt(q0));
                if (Integer.parseInt(w1)<0) {
                    itsCanToDecide = false;
                }
            } else {
                // q0 - ?, w0 - число
                q0 = Integer.toString(Integer.parseInt(e0) - Integer.parseInt(w0));
                if (Integer.parseInt(q0)<0) {
                    itsCanToDecide = false;
                }
            }
        } else {
            if (w0.equals("?")) {
                // q0 - число, w0 - ?
                w0 = Integer.toString(Integer.parseInt(e0) - Integer.parseInt(q0));
                if (Integer.parseInt(w0)<0) {
                    itsCanToDecide = false;
                }
            } else {
                // q1 - число, w1 - число
            }
        }

        if (itsCanToDecide) {
            System.out.println("Решение есть!");
        } else {
            System.out.println("Решения нет!");
        }
        System.out.printf("Результат:\n %s%s + %s%s = %s%s\n", q0, q1, w0, w1, e0, e1);
        sc.close();
    }

    /**
     * @param val
     * @return
     */
    public static boolean CheckNumber(String val) {
        //проверка корректности переменной.
        //допустимые символы: цифры, ?, двузначное число.
        //если число корректное - возврат true, иначе false.

        if (val.length() != 2) {
            System.out.println("Требуется ввести двузначное число!");
            return false;
        }
        char ch = val.charAt(0);
        if (!(ch == '?' || Character.isDigit(ch))) {
            System.out.println("Число должно включать только цифры или знак ?");
            return false;
        }
        ch = val.charAt(1);
        if (!(ch == '?' || Character.isDigit(ch))) {
            System.out.println("Число должно включать только цифры или знак ?");
            return false;
        }
        //проверки пройдены, считаем число допустимым
        return true;
    }

/* 
    * @param val
    * @return
    */
   public static boolean CheckNumber_2(String val) {
       //проверка корректности переменной.
       //допустимые символы: цифры, ?, двузначное число.
       //если число корректное - возврат true, иначе false.

       if (val.length() != 2) {
           System.out.println("Требуется ввести двузначное число!");
           return false;
       }
       char ch = val.charAt(0);
       if (!Character.isDigit(ch)) {
           System.out.println("Число должно включать только цифры или знак ?");
           return false;
       }
       ch = val.charAt(1);
       if (!Character.isDigit(ch)) {
           System.out.println("Число должно включать только цифры или знак ?");
           return false;
       }
       //проверки пройдены, считаем число допустимым
       return true;
   }    
}
