// описание задания в файле description.txt

package ExceptionsCourse.seminar3.hw;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // каталог с файлами для записи данных
        String filesFolder = "./ExceptionsCourse/seminar3/hw/files/";
        Scanner sc = new Scanner(System.in);

        boolean toContinue = true; // признак продолжения цикла, что q не была нажата
        // В цикле до выхода (нажатие клавиши q) вводим персоны

        while (toContinue) {
            try {
                // Ввод данных персоны
                Person person = inputPerson(sc);
                // Выводим введенные данные, как упорядоченный итог
                if (person != null) {
                    System.out.println("Данные персоны:\n" + person.toString());
                    // Сохранение персоны в файл
                    if (person.saveToFile(filesFolder)) {
                        System.out.println("Персона успешно сохранена в каталоге " + filesFolder + "\n");
                    } else {
                        System.out.println("Ошибка при добавлении персоны.\n");
                    } 
                }
            } catch (MyQuitException e) {
                //корректное завершение программы
                toContinue = false;
                System.out.println(e.getMessage());
            } catch (NullPointerException e) {
                System.out.println("Ошибка - получено значение null объекта person. Добавление прервано!");
            } catch (MyUserInputParsingException e) {
                System.out.println("Ошибка парсинга данных при чтении файлов! Добавление прервано!");
            }

        }
        sc.close();
    }

    public static Person inputPerson(Scanner sc) throws MyQuitException, MyUserInputParsingException, RuntimeException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "dd.MM.yyyy"); // формат даты
        
        try {
            // Ввод данных по сотруднику
            System.out.print("Добавить сотрудника? (q - нет, любая клавиша - да): ");
            String whatToDo = sc.nextLine();
            if (whatToDo.toUpperCase().equals("Q")) {
                throw new MyQuitException("Выход из программы");
            }

            System.out.print("Фамилия: ");
            String lastName = sc.nextLine();
            System.out.print("Имя: ");
            String firstName = sc.nextLine();
            System.out.print("Отчество: ");
            String fathersName = sc.nextLine();
            System.out.print("Дата рождения (пример 12.01.1993): ");
            String birthDate = "";
            try {
                LocalDate tmpDate = LocalDate.parse(sc.nextLine(), formatter);
                birthDate = tmpDate.format(formatter);
            } catch (RuntimeException e) {
                throw new MyUserInputParsingException("неверный формат даты рождения");
            }
            System.out.print("Телефон: ");
            Long phone;
            try {
                phone = Long.parseLong(sc.nextLine());
            } catch (RuntimeException e) {
                throw new MyUserInputParsingException("неверный формат номера телефона (нужно ввести целое число)");
            }
            System.out.print("Пол (введите f или m) :");
            char gender = sc.nextLine().charAt(0);
            if (!(gender == 'f' || gender == 'm')) {
                throw new MyUserInputParsingException("неверное значение пола - допустимо f или m");
            }

            return (new Person(lastName, firstName, fathersName, birthDate, phone, gender));

        } catch (MyQuitException e) {
            //пробрасываем это исключение для обработки в main
            throw new MyQuitException(e.getMessage());
        } catch (MyUserInputParsingException e) {
            //пробрасываем это исключение для обработки в main
            throw new MyUserInputParsingException(e.getMessage());
        }
        catch (RuntimeException e) {
            return null;
        }
    }
}
