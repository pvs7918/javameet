/*
 * Напишите метод, который составит строку, состоящую из 100 повторений
 * слова TEST и метод, который запишет эту строку в простой текстовый файл,
 * обработайте исключения.
 */
package seminar2.lesson;

import java.io.FileWriter;
import java.io.IOException;

public class task4 {
    public static void main(String[] args) throws IOException {
        String s1 = "TEST";
        String str2 = s1.repeat(2);

        FileWriter fr1 = new FileWriter("file.txt",true);
        fr1.append(str2);
        fr1.close();

    }
}
