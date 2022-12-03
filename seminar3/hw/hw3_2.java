/*
2. Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
*/

package seminar3.hw;

import java.util.ArrayList;
import java.util.Random;

public class hw3_2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int N = 10;
        int MaxVal = 20;
        ArrayList<Integer> Arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            Arr.add(new Random().nextInt(MaxVal));
        }
        System.out.println("Исходный массив:");
        System.out.println(Arr);

        for (int i = 0; i < Arr.size(); i++) {
            if (Arr.get(i) % 2 == 0) {
                Arr.remove(i--);
            }
        }
        System.out.println("Итоговый массив:");
        System.out.println(Arr);
    }
}
