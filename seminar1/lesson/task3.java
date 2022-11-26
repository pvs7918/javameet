/*
Дан массив nums = [3,2,2,3] и число val = 3.
Если в массие есть числа, равные заданному,
нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов
массива должны быть отличны от заданного, а остальные - равны ему.
 */

package seminar1.lesson;


public class task3 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3,1};
        int val = 3;
        int last_pos = nums.length - 1;

        //Выводим исходный массив
        System.out.println("Исходный массив:");
        for (int i=0; i<nums.length;i++) {
            System.out.printf("%d ", nums[i]);
        }
        System.out.println();


        for (int i=0; i<nums.length;i++) {
            if (nums[i]==val) {
                //вычисляем позицию вставки числа 3
                while(val==nums[last_pos] && i<last_pos) {
                    last_pos--;
                }
                int tmp = nums[i];
                nums[i] = nums[last_pos];
                nums[last_pos] = tmp;
            }
        }
        //Выводим результирующий массив
        System.out.println("Результирующий массив:");
        for (int i=0; i<nums.length;i++) {
            System.out.printf("%d ", nums[i]);
        }
        System.out.println();
        
    }
}
