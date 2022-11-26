/*
3.	Реализовать простой калькулятор
* */

package seminar1.hw;

import java.util.Scanner;

public class hw1_3 {
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
