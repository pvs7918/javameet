/*
4*. (Необязательная задача повышенной сложности)
Даны два ArrayList из целых чисел. Написать функции, которые вычисляют разницу коллекций:
Разность:
A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
B - A = все числа из второй коллекции, которые не содержатся в первой
Симметрическая разность:
A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй, которых нет в первой
*/

package seminar3.hw;

import java.util.ArrayList;
import java.util.Random;

public class hw3_4 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int sizeA = 4;
        int sizeB = 3;
        int MaxVal = 5;
        //Формируем списки и заполяем случайными значениями
        ArrayList<Integer> lstA = new ArrayList<>(sizeA);
        ArrayList<Integer> lstB = new ArrayList<>(sizeB);
        for (int i = 0; i < sizeA; i++) {
            lstA.add(new Random().nextInt(MaxVal));
        }
        for (int i = 0; i < sizeB; i++) {
            lstB.add(new Random().nextInt(MaxVal));
        }

        //Исходные списки
        System.out.println("Исходные списки:");
        System.out.println("Список А:");
        System.out.println(lstA);
        System.out.println("Список B:");
        System.out.println(lstB);        

        // Вычисляем требуемые значения
        ArrayList<Integer> DiffA_B = ListsDifference(lstA, lstB);
        ArrayList<Integer> DiffB_A = ListsDifference(lstB, lstA);
        ArrayList<Integer> SimmDiff = ListsSimmetricDifference(lstA, lstB);

        System.out.println("Результаты:");
        System.out.println("А - B:");
        System.out.println(DiffA_B);
        System.out.println("B - A:");
        System.out.println(DiffB_A);        
        System.out.println("Симметрическая разность:");
        System.out.println(SimmDiff);    
    }

    public static ArrayList<Integer> ListsDifference(ArrayList<Integer> lstA, ArrayList<Integer> lstB) {
        // метод добавляем в результирующий список все числа из первой коллекции,
        // которые не содержатся во второй коллекции
        ArrayList<Integer> ResArr = new ArrayList<>();
        for (int i = 0; i < lstA.size(); i++) {
            boolean isPresent = false; //признак присутсвия
            for (int j = 0; j < lstB.size(); j++) {
                if (lstA.get(i).equals(lstB.get(j))) {
                    isPresent=true;
                }
            }
            if (!isPresent) {
                ResArr.add(lstA.get(i));
            }
        }
        return ResArr;
    }

    public static ArrayList<Integer> ListsSumm(ArrayList<Integer> lstA, ArrayList<Integer> lstB) {
        // метод добавляем в результирующий список все числа из первой коллекции,
        // которые не содержатся во второй коллекции
        ArrayList<Integer> ResArr = new ArrayList<>();
        for (Integer item: lstA) {
                ResArr.add(item);
        }
        for (Integer item: lstB) {
            ResArr.add(item);
        }
        return ResArr;
    }

    public static ArrayList<Integer> ListsSimmetricDifference(ArrayList<Integer> lstA, ArrayList<Integer> lstB) {
        // Симметрическая разность:
        // A ^ B = числа из первой коллекции, которых нет во второй,
        // А ТАКЖЕ числа из второй, которых нет в первой
        
        ArrayList<Integer> DiffA_B = ListsDifference(lstA, lstB);
        ArrayList<Integer> DiffB_A = ListsDifference(lstB, lstA);
        return ListsSumm(DiffA_B, DiffB_A);
    }    
}
