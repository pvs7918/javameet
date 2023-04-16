/*
 * 4. Разработайте программу, которая выбросит Exception, когда пользователь
 * вводит пустую строку. Пользователю должно показаться сообщение, что пустые
 * строки вводить нельзя.
 */
package ExceptionsCourse.seminar2.hw.Task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        try {
            System.out.print("Введите строку текста: ");
            String inputString  = sc.nextLine();
            if (inputString.equals("")) {
                throw new RuntimeException("Введена пустая строка, это недопустимо!\n");
            }
            System.out.println("Введена строка: " + inputString);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
