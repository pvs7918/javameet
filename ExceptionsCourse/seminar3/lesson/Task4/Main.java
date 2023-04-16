/*Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ
или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией,
в какой именно ячейке лежат неверные данные.
В методе main() вызвать полученный метод, обработать возможные исключения 
MyArraySizeException и MyArrayDataException и вывести результат расчета (сумму элементов,
при условии что подали на вход корректный массив).
*/

package ExceptionsCourse.seminar3.lesson.Task4;

public class Main {
    public static void main(String[] args) {
        String [][]arr1 =  {{"1f","2","3","4"},
                            {"5","6","7","8"},
                            {"9","10","11","12"},
                            {"13","14","15","16"}};
        int [][]arr2 = {{1,2,3,4}};
        try {
            int sum = Summ2DArray(arr1);
            System.out.println("Сумма равна: " + sum);
        } catch(MyArraySizeException e) {
            throw new MyArraySizeException("Массив не той размерности");
        }
    }

    public static Integer Summ2DArray(String [][]Arr) {
        Integer sum = 0;
        if (Arr.length != 4) {
            throw new MyArraySizeException("Высота массива не соответствует требуемому!");
        }
        for (int i=0;i<Arr.length;i++) {
            for (int j=0;j<Arr[0].length;j++) {
                if (Arr[i].length != 4) {
                    throw new MyArraySizeException("Ширина массива не соответствует требуемому!");
                }
                try {
                Integer curNumber = Integer.parseInt(Arr[i][j]);
                sum += curNumber;
                } catch (NumberFormatException e) {
                    
                }
            }
        }

        return sum;

    }
}
