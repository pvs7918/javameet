/*
 * вывести приветствие по запрашиваемому имени
 */

package seminar1.lesson;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Привет, " + name);
        sc.close();
    }
}
