package OOP.seminar7.hw.view;

import java.util.*;

import OOP.seminar7.hw.classes.AgentA;

public class AgentView {

    public void showMenu() {
        // показать меню в консоли
        System.out.println("\nБД контрагентов\n----------------\nВыберите пункт меню:");
        System.out.println("1. Посмотреть список контрагентов;");
        System.out.println("2. Найти контрагента по названию. Показать подробности;");
        System.out.println("3. Добавить контрагента;");
        System.out.println("4. Удалить контрагента;");
        System.out.println("5. Добавить контакт контрагенту;");
        System.out.println("6. Удалить контакт у контрагента;");        
        System.out.println("0. Выход.");
    }

    public void ShowResult(List<AgentA> agents) {
        System.out.println("\nВывод результата\n----------------");
        for (AgentA item : agents) {
            System.out.println(item.toString());
            System.out.println("********************");
        }
    }

}
