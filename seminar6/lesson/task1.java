package seminar6.lesson;

/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными числами от 0 до 24. 
2. Создайте метод, в который передайте заполненный выше массив, и с помощью Set
вычислите процент уникальных значений в данном массиве, и верните его в виде числа
с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел =
        количество уникальных чисел * 100 / общее количество чисел в массиве.
Set<K>

.add
.remove
.contains

 */
import java.util.*;

public class task1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int N = 1000;
        int[] ar = new int[N];
        Random rnd = new Random();

        for (int i = 0; i < N; i++) {
            ar[i] = rnd.nextInt(500);
        }
        System.out.println("Исходные значения:");
        System.out.println(Arrays.toString(ar)); 

        double res = unicRate(ar);
        System.out.printf(" Процент уникальных чисел =%.2f\n", res);
    }

    public static double unicRate(int[] ar) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < ar.length; i++) {
            set.add(ar[i]);
        }
        System.out.println("Уникальные значения (set):"); 
        System.out.println(set);

        return (double) set.size() * 100 / (double) ar.length;
    }

}
