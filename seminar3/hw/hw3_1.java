/*
1. Реализовать алгоритм сортировки слиянием.
*/

package seminar3.hw;

import java.util.ArrayList;
import java.util.Random;

public class hw3_1 {
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
        System.out.println("Исходный список:");
        System.out.println(Arr);

        // сортируем список методом слияния
        ArrayList<Integer> resArr = SortingByMerge(Arr, 0, Arr.size() - 1);

        System.out.println("Итоговый список:");
        System.out.println(resArr);
    }

    public static ArrayList<Integer> SortingByMerge(ArrayList<Integer> Arr, int begin, int end) {
        int middle = begin + (end - begin) / 2;
        ArrayList<Integer> ArrRes = new ArrayList<>();

        if (end == begin) {
            ArrRes.add(Arr.get(begin));
        } else {
            // сортировка списка методом слияния
            // формируем левый и правый списки рекуретно вызывая функцию слева и справа
            ArrayList<Integer> ArrLeft = new ArrayList<>();
            ArrayList<Integer> ArrRight = new ArrayList<>();
            if (begin < middle) {
                ArrLeft = SortingByMerge(Arr, begin, middle);
            } else {
                ArrLeft.add(Arr.get(begin));
            }

            if (middle < end) {
                ArrRight = SortingByMerge(Arr, middle + 1, end);
            } else {
                ArrRight.add(Arr.get(end));
            }
            // объединяем левый и правый списки
            int indexLeft = 0;
            int indexRight = 0;
            int ArrResSize = ArrLeft.size() + ArrRight.size();
            for (int i = 0; i < ArrResSize; i++) {
                if (indexLeft == ArrLeft.size()) { // левый массив пройден полностью
                    ArrRes.add(ArrRight.get(indexRight++));
                } else if (indexRight == ArrRight.size()) { // правый массив пройден полностью
                    ArrRes.add(ArrLeft.get(indexLeft++));
                } else if (ArrLeft.get(indexLeft) < ArrRight.get(indexRight)) {
                    ArrRes.add(ArrLeft.get(indexLeft++));
                } else {
                    ArrRes.add(ArrRight.get(indexRight++));
                }
            }
        }
        return ArrRes;
    }
}
