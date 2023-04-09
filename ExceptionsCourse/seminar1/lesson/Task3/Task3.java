/*
 * Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив. 
Метод должен пройтись по каждому элементу и проверить что он не равен null. 
А теперь реализуйте следующую логику:
Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
 */
package ExceptionsCourse.seminar1.lesson.Task3;

public class Task3 {    public static void main(String[] args) {
    Integer[] arr = new Integer[] { 1, 2, null, 3, null, 4, null };
    checkArray(arr);
}

public static void checkArray(Integer[] arr) {
    int count = 0;
    String nullIndex = "";
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == null) {
            count += 1;
            nullIndex += i + " ";
            // System.out.printf("%d ", i);
        }
    }
    if (count == 1) {
        System.out.printf("Найден null элемент под индексом %s ", nullIndex);
    } else if (count > 1) {
        System.out.printf("Найдены null элементы под индексами: ");
        System.out.printf("%s ", nullIndex);
    } else {
        System.out.println("Элементы null не найдены!");
    }
}
}
