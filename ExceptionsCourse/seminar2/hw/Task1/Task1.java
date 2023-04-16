/*
 * Реализуйте метод, который запрашивает у пользователя ввод 
 * дробного числа (типа float),
 * и возвращает введенное значение. Ввод текста вместо 
 * числа не должно приводить к падению приложения, вместо этого,
 * необходимо повторно запросить у пользователя ввод данных.
 */

package ExceptionsCourse.seminar2.hw.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // в цикле вводим вещественное число, предупрежая об ошибках пользователя
        float floatVal;
        try {
            floatVal = inputFloatNumber();
            System.out.println("Результат - введено число: " + floatVal);
        } catch (MyQuitException e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * @return
     */
    public static float inputFloatNumber() throws MyQuitException {
        Scanner sc = new Scanner(System.in);
        boolean isNotEntered = true; // признак того, что число ещё не введено
        float val = 0;
        String enteredString = "";
        while (isNotEntered) {
            try {
                System.out.print("Введите число (q - выход): ");
                enteredString = sc.nextLine();
                val = Float.parseFloat(enteredString);
                isNotEntered = false;
            } catch (RuntimeException e) {
                if (enteredString.toUpperCase().equals("Q")) {
                    throw new MyQuitException("Выход из программы");
                }
                System.out.println("Ошибка ввода! Введите вещественное число.");
            }
        }
        sc.close();
        return val;
    }
}
