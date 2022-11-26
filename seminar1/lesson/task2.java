/*
 * дан массив двоичных чисел [1,1,0,1,1,1]. Вывести максимальное количество подряд идущих 1.
 */

package seminar1.lesson;

//import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int[] ba = {1,1,0,1,1,1};
        int max_len = 0;
        int cur_len = 0;
        for (int i=0; i<ba.length;i++) {
            if (ba[i]==1) {
                cur_len++;
            } else {
                if (cur_len > max_len) {
                    max_len = cur_len;
                }
                cur_len=0;
            }
        }
        //после выхода из цикла проверяем длину последней цепочки, сравниваем с максимальной
        if (cur_len > max_len) {
            max_len = cur_len;
        }
        System.out.printf("Максимальное количество единиц в массиве равно: %d", max_len);
        
    }
}
