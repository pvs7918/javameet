/*
1.	Вычислить n-ое треугольного число(сумма чисел от 1 до n),
n! (произведение чисел от 1 до n) 
* */

package seminar1.hw;

import java.util.Scanner;

public class hw1_1 {
    public static void main(String[] args) {
        long trg = 0;
        long fct = 1;
        //Ввод числа n
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = sc.nextInt();
        //вычисляем одновременно треугольное число и факториал числа n
        for (int i = 1; i <=n; i++) {
            trg += i;
            fct *= i;
        }
        System.out.printf("для числа n=%d, треугольное число=%d, %d!=%d\n", n, trg, n, fct);
        sc.close();
    }
}
