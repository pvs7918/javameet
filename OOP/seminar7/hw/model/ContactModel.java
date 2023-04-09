package OOP.seminar7.hw.model;
import java.io.*;
import java.time.LocalDate;
import java.util.*;

import OOP.seminar7.hw.classes.*;


public class ContactModel implements DataModel<Contact>{
    private List<Contact> contacts; // список контактов
    private String filename; // название файла с исходными данными

    @Override
    public void add(Object rec) {
        // добавление новой записи в список agents
        contacts.add((Contact) rec);
    }   

    @Override
    public void save() {
        // сохранение списка агентов в файл БД

    }

    @Override
    public List<Agent> load() {
        // загрузка списка агентов из файла БД в agents
        agents = new LinkedList<>();
        // открываем и читаем данные из файла

        try (FileReader fr = new FileReader(filename)) {
            Scanner scanner = new Scanner(fr);
            int i=0; //номер строки
            while (scanner.hasNextLine()) {
                //читаем строку исходного файла
                String curRow = scanner.nextLine();
                // первую строку пропускаем, это шапка с названием полей
                if (i>0) {
                    //расщепляем строку разделителем ; на поля
                    String[] fields = curRow.split(";");
                    int curId = Integer.parseInt(fields[0].trim());
                    String curAgent_type = fields[1].trim();
                    String curName = fields[2].trim();
                    switch(curAgent_type) {
                        case ("Company"):
                            String country = fields[3].trim();    
                            String products = fields[4].trim();
                            AgentCompany agentCompany = new AgentCompany(curId, curAgent_type, curName, null, country, products);
                            agents.add((Agent) agentCompany);
                            break;
                        case ("Person"):
                            LocalDate birthdate = LocalDate.parse(fields[3].trim());
                            AgentPerson agentPerson = new AgentPerson(curId, curAgent_type, curName, null, birthdate);
                            agents.add((Agent) agentPerson);
                            break;   
                        default:
                            System.out.println("Ошибка: Неизвестный тип объекта-контрагента" +
                            curAgent_type + " в исходном файле" + filename);
                            break;                         
                    }
                }
                i++;
            }
            scanner.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

        return agents;
    }

    // возврат полного списка студентов без фильтрации и доп.упорядочивания
    public List<Agent> getAgentsAll() {
        return agents;
    }

    // возврат полного списка отсортированного по успеваемости по убыванию

    /*public List<Student> getStudentsAllSortedDescByAttendance() {
        Collections.sort(students, new StudentComparator()); // по убыванию
        return students;
    }

    // выбирает студентов с посещаемостью ниже чем border.
    public List<Student> getStudentsAttendanceLess(int border) {
        List<Student> resList = new ArrayList<>();

        for (Student item : students) {
            if (item.getAttendancePercent() <= border) {
                resList.add(item);
            }
        }
        return resList;
    }*/

    @Override
    public String toString() {
        String res = "";
        for (Contact item : contacts) {
            res += item.toString();
        }
        return "Contacts : [" + res + "]";
    }
 
}
