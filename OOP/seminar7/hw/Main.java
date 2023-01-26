/*Урок 7. ООП Дизайн и Solid ч.2
Напишите приложение, которое позволяет пользователю управлять своим
списком контактов. Используйте наследование, полиморфизм, принципы SOLID.

Контрагент — это либо человек, либо компания.

У каждого контрагента есть список способов связаться: телефон, email,
ник в telegram, адрес страницы VK, уличный адрес. Разрешается, что у
одного контрагента сколько угодно способов связаться, например, несколько
телефонов или несколько адресов.

Программа должна позволять следующие действия:

• Посмотреть список контрагентов
• Найти контрагента по названию. Посмотреть подробную информацию о нём
• Добавить контрагента
• Удалить контрагента
• Добавить новый способ связаться с контрагентом
• Удалить способ связаться с контрагентом

Если задача кажется слишком простой, вы можете выбрать следующие
необязательные усложнения:

• Используйте паттерн MVC или MVP для архитектуры приложения
• Решите задачу на языке, отличном от Java
• Возможность сохранять книгу контактов в файл, загружать из файла
*/

/*
У меня будут контрагенты российской компании,
которая занимается международной торговлей
(поэтому есть немного контактов с других стран)
 */
package OOP.seminar7.hw;

import OOP.seminar7.hw.view.*;
import OOP.seminar7.hw.model.*;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Модель
        AgentModel model = new AgentModel("./OOP/seminar7/hw/db/", 
            "agents.txt", "contacts.txt");

        // Создаем объекты View Presenter (MVP)
        AgentView view = new AgentView();
        // Создаем презентер и запускаем его
        Presenter presenter = new Presenter(model, view);
        presenter.run();

    }

}
