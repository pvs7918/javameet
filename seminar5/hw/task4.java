/*
4*. На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
 */
package seminar5.hw;

import java.util.*;

public class task4 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        // список вариантов расположения ферзей на доске: [0, 4, 7, 5, 2, 6, 1, 3] -
        // такая запись варианта
        // использование Set позволяет исключить дубли вариантов

        // текущий вариант положения ферзей на доске. номер ферзя определяет ряд.
        // нумеруем с 0
        int[] position = new int[8];
        long positionCount = 1;
        //сначала использовал HashSet, но он выводится не отсортированный,
        //поэтому перешел на TreeSet, в нем варианты распологаются также как и добавляются
        // - упорядочено
        Set<String> trueVariants = new TreeSet<String>();
        boolean isPresentPos = false;
        boolean checkPositionResult;

        /*
         * Для отладки функции checkPosition на конкретных примерах
         * boolean res = test();
         * return;
         */

        do {
            checkPositionResult = checkPosition(position);
            if (checkPositionResult == true) {
                trueVariants.add(Arrays.toString(position));
            }
            isPresentPos = getNextPosition(position);
            // считаем количество всех позиций
            if (isPresentPos) {
                positionCount++;
            }
        } while (isPresentPos);

        for (var item : trueVariants)
            System.out.println(item);

        System.out.printf("Всего вариантов позиций: %d, правильных: %d\n", positionCount, trueVariants.size());

    }

    public static boolean test() {
        // Для отладки функции checkPosition на конкретном правильном примере
        int[] position = new int[] { 0, 4, 7, 5, 2, 6, 1, 3 };
        return checkPosition(position);
    }

    public static boolean checkPosition(int[] position) {
        // занятость шахматной доски
        boolean[][] desk = new boolean[8][8];
        // признак того, что вариант подходит

        // расставляем ферзей по доске
        for (int i = 0; i < 8; i++) {
            // position[i] - 'это ряд который занимаем'
            desk[position[i]][i] = true;
            // также делаем проверку по горизонтали
            // проверка по горизонтали (в ряду), есть ли на k-ряду (горизонтали) другие
            // ферзи
            for (int j = i + 1; j < 8; j++) {
                if (position[i] == position[j])
                    return false;
            }
        }

        // проверяем рубят ли фигуры друг друга
        for (int i = 0; i < 8; i++) { // для каждого ферзя (она же колонка)
            // позиция i-го ферзя на доске
            int br = position[i];
            int bc = i;

            // проверку по вертикали не делаем так как каждый ферзь в своей колонке

            // проверки по диагонали
            // вверх-налево
            int r = br - 1;
            int c = bc - 1;
            while (r >= 0 && c >= 0) {
                if (desk[r][c] == true) {
                    return false;
                }
                r--;
                c--;
            }
            // вверх-направо
            r = br - 1;
            c = bc + 1;
            while (r >= 0 && c < 8) {
                if (desk[r][c] == true) {
                    return false;
                }
                r--;
                c++;
            }
            // вниз-налево
            r = br + 1;
            c = bc - 1;
            while (r < 8 && c >= 0) {
                if (desk[r][c] == true) {
                    return false;
                }
                r++;
                c--;
            }
            // вниз-направо
            r = br + 1;
            c = bc + 1;
            while (r < 8 && c < 8) {
                if (desk[r][c] == true) {
                    return false;
                }
                r++;
                c++;
            }
        }
        // все варианты проверили, пересечений не найдено, вовзращаем true
        return true;
    }

    public static boolean getNextPosition(int[] position) {
        // если варианты закончились возвращает false, иначе возвращает true
        // меняем положение в исходном массиве

        int size = 8;
        int i = size - 1;
        //в массиве position ищем, начиная с конца, первое число < 7
        while (i >= 0 && position[i] == size - 1) {
            i--;
        }

        if (i >= 0) {
            //найденное число меньшее 7 увеличиваем на 1, а цифры правее (семерки) обнуляем
            position[i]++;
            for (int j = i + 1; j < size; j++) {
                position[j] = 0;
            }
            return true;
        }
        // после достижении варианта 77777777 возвращает false
        return false;
    }
}
