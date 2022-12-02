/*
3.	В файле содержится строка с данными:
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Напишите метод, который разберёт её на составные части и,
используя StringBuilder создаст массив строк такого вида:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
* */

package seminar2.hw;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class hw2_3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Читаем исходную json-строку из файла
        String json = "";
        try {
            FileReader fr1 = new FileReader("./seminar2/hw/hw2_3.json");
            Scanner scan = new Scanner(fr1);

            if (scan.hasNextLine()) {
                json = scan.nextLine();
            }
            fr1.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Исходная json-строка:");
        System.out.println(json);

        // разбиваем json-строку, формируем список строк заключенные в { }
        ArrayList<String> persons = new ArrayList<>();
        int begin = 0;
        int end = 0;
        do {
            begin = json.indexOf('{', end);
            if (begin > 0) {
                end = json.indexOf('}', begin);
                if (end > 0) {
                    persons.add(json.substring(begin + 1, end - 1));
                }
            }
        } while (begin > 0);

        // формируем массив строк
        ArrayList<String> resArr = new ArrayList<>();

        for (int i = 0; i < persons.size(); i++) {
            // обрезаем подстроку по фигурные скобки и делаем split
            StringBuilder curstr = new StringBuilder();
            String[] params = persons.get(i).split(",");

            for (int j = 0; j < params.length; j++) {
                // каждый параметр - делаем trim и расщепляем через :
                String[] substr = params[j].trim().split(":");

                // в названии параметра убираем ""
                String tmpkey = substr[0].replaceAll("\"", "");
                String tmpvalue = substr[1].trim().replaceAll("\"", "");

                // формируем предложение
                // образец: Студент Краснов получил 5 по предмету Физика.
                if (tmpkey.equals("фамилия")) {
                    curstr.append("Студент " + tmpvalue);
                } else if (tmpkey.equals("оценка")) {
                    curstr.append(" получил " + tmpvalue);
                } else if (tmpkey.equals("предмет")) {
                    curstr.append(" по предмету " + tmpvalue + ".");
                }
            }
            // добавляем полученную строку в массив строк
            resArr.add(curstr.toString());
        }

        // вывод результата
        System.out.println("Результат:");
        for (String item : resArr) {
            System.out.println(item);
        }
    }
}
