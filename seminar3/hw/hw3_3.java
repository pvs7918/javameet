/*
3. Задан целочисленный список ArrayList. Найти минимальное,
максимальное и среднее арифметическое этого списка.
*/

package seminar3.hw;

import java.util.ArrayList;
import java.util.Random;

public class hw3_3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int ArrSize = 6;
        int MaxVal = 20;
        ArrayList<Integer> Arr = new ArrayList<>();

        int minval = 0;
        int maxval = 0;
        float avrval = 0;
        for (int i = 0; i < ArrSize; i++) {
            Arr.add(new Random().nextInt(MaxVal));

            if (i == 0) {
                minval = Arr.get(i);
                maxval = Arr.get(i);
            } else if (Arr.get(i) < minval) {
                minval = Arr.get(i);
            } else if (Arr.get(i) > maxval) {
                maxval = Arr.get(i);
            }
            avrval += Arr.get(i);
        }
        avrval /= Arr.size();

        System.out.println("Исходный массив:");
        System.out.println(Arr);
        System.out.printf("минимальное =%d, максимальное =%d и среднее арифметическое =%.1f.", minval, maxval, avrval);
    }
}
