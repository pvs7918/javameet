/*
2.	Вывести все простые числа от 1 до 1000 
* */

package seminar1.hw;

import java.util.ArrayList;
//import java.util.Scanner;

public class hw1_2 {
    public static void main(String[] args) {
        //Ввод числа n
        /*Scanner sc = new Scanner(System.in);
        System.out.printf("Введите число N: ");*/
        int N = 1000; //sc.nextInt();
        //список для хранения простых чисел
        ArrayList<Integer> arL = new ArrayList<>();
        
        for (int i = 1; i <=N; i++) {
            boolean isSimple = true; //признак что число является простым
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimple = false;
                }
            }
            if (isSimple) {
                arL.add(i);
            }
        }

        //Вывод результата
        System.out.printf("Простые числа от 1 до %d:\n", N);
        for (int i = 1; i < arL.size(); i++) {
            System.out.println(arL.get(i)); 
        }
        //sc.close();
    }
}
