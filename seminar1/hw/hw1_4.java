/*
4.	*+Задано уравнение вида q + w = e. При q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса,
например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет.
* */

package seminar1.hw;

import java.util.Scanner;

public class hw1_4 {
    public static void main(String[] args) {
        Double Res = getValues();
        System.out.printf("Результат: %.2f\n", Res);
    }

    public static double getValues() {
        //Ввод переменных и операции
        Scanner sc = new Scanner(System.in);
        System.out.println("Простой калькулятор");
        System.out.printf("Введите первое число: ");

        double Val1 = Double.parseDouble(sc.nextLine());
        System.out.printf("Введите операцию (+,-,*,/,^): ");
        String Oper = sc.nextLine();
        System.out.printf("Введите второе число: ");
        double Val2 = Double.parseDouble(sc.nextLine());
        double Res = 0;
        switch (Oper) {
            case "+":
                Res = Val1 + Val2;
                break;
            case "-":
                Res = Val1 - Val2;
            break;   
            case "*":
                Res = Val1 * Val2;
            break;   
            case "/":
                Res = Val1 / Val2;
            break;                
            case "^":
                Res = Math.pow((double) Val1, (double) Val2);
            break;               
        }
        sc.close();
        return Res;
    }

}
