/*
 * реализовать консольное приложение, которое в цикле:
Принимает от пользователя строку вида 
text~num
Нужно разделить строку по ~, сохранить text в связный список на позицию num.
Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.


 */
package seminar4.lesson;

import java.util.LinkedList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> lst = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите значение вида text~num:");
            String input = scanner.nextLine();

            String[] substr = input.split("~");
            int index = Integer.parseInt(substr[1]);

            if (index > lst.size() || index < 0) {
                System.out.println("некоректное значение num");
            } 
            else if (substr[0].equals("print")) 
            {
                System.out.println(lst.get(index));
                lst.remove(index);
            } else {
                lst.add(index, substr[0]);
            }

            System.out.println(lst);
        }
        scanner.close();
    }
}
