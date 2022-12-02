/*
2.	Реализуйте алгоритм сортировки пузырьком числового массива,
результат после каждой итерации запишите в лог-файл.

* */

package seminar2.hw;

import java.io.FileWriter;
import java.io.IOException;
//import java.util.ArrayList;
import java.util.Arrays;

public class hw2_2 {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        //Создает файл логирования, для добавления записей об операциях по сортировке массива.
        FileWriter fr1;
        try {
            fr1 = new FileWriter("./seminar2/hw/hw2_2.log", true);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
            return;
        }

        //Создаем массив наполненный случайными числами
        int N = 10;
        int MaxVal = 20;
        int[] ls = new int[N];
        for (int i=0;i<N;i++) {
            //добавляем в массив случайное число
            ls[i]=rnd(1,MaxVal);
        }
        //Выводим на экран исходный массив и в лог-файл записываем
        String s1 = Arrays.toString(ls);
        System.out.println("\nИсходный массив:\n" + s1);
        fr1.append("\nИсходный массив:\n" + s1 + "\n");

        //признак обмена местами элементов при одном проходе массива
        boolean isChanged = false;
        //Сортируем массив методом пузырька с логированием каждого шага
        
        for (int j=1;j<N;j++) {
            isChanged = false;
            for (int i=0;i<N-j;i++) {
                if (ls[i]>ls[i+1]) {
                    int tmp = ls[i];
                    ls[i] = ls[i+1];
                    ls[i+1] = tmp;
                    isChanged = true;
                    //запись в лог-файл выполненной операции
                    try {
                        s1 = "перестановка элементов: ls[" + (i) + "]=" + ls[i] + " и ls[" + (i+1) + "]=" + ls[i+1] + "\n";
                        System.out.printf(s1);
                        fr1.append(s1);
                    }
                    catch (Exception e) {
                        System.out.println("Ошибка записи в файл лога");
                        return;
                    }

                }
            }
            // если на шаге не было перестановок, то массив уже отсортирован,
            // прекращам досрочно выполнение цикла
            if (!isChanged) break;
        }
        
        //Выводим на экран исходный массив и в лог-файл записываем
        s1 = Arrays.toString(ls);
        System.out.println("Сортировка выполнена. Конечный массив:\n" + s1);
        fr1.append("Сортировка выполнена. Конечный массив:\n" + s1);
        fr1.close();
    }

    public static int rnd(int min, int max)
    {
        max -= min;
        double curval = Math.random();
        curval *= max;
        curval += min;
        int res = (int) (curval);
        return res;
    }
    
}
