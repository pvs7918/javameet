/*
1.	Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
что один человек может иметь несколько телефонов.
 */
package seminar5.hw;

import java.util.*;

public class task1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int Count = 2;
        // структура для хранения телефонного справочника
        Map<String, List<String>> phonesDB = new HashMap<>();

        System.out.println("Телефонный справочник. Ввод данных");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < Count; i++) {
            System.out.printf("Введите ФИО записи №%d: ", i);
            String fio = scanner.nextLine();
            System.out.printf("Введите номера телефонов через запятую записи №%d: ", i);
            String phonesStr = scanner.nextLine();
            // расщепляем введенные номера разделителем ,
            ArrayList<String> phones = new ArrayList<>(Arrays.asList(phonesStr.trim().split(",")));

            for (int j = 0; j < phones.size(); j++) {
                // убираем у каждого телефона лишние пробелы в начале и в конце
                phones.set(i, phones.get(i).trim());
            }
            // в справочник добавляем новую запись
            phonesDB.put(fio, phones);
        }
        System.out.println("Содержимое телефонного справочника:");
        System.out.println(phonesDB);

        scanner.close();
    }
}
