/*
 * с помощью метода проверить является ли строка палиндромом. Функция должна
 * возвращать boolean


 */
package seminar2.lesson;

public class task3 {
    public static void main(String[] args) {
        String stringSecond2 = "потоп";
        System.out.println(IsPolindrom(stringSecond2));
    }
    public static boolean IsPolindrom(String str1) {
        StringBuilder str2 = new StringBuilder(str1);
        return str2.reverse().toString().equals(str1);
    }
}
