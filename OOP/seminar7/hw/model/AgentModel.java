package OOP.seminar7.hw.model;

import OOP.seminar7.hw.classes.*;
import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class AgentModel<Agent> implements DataModel {
    private List<Agent> agents; // список агентов
    private String path_db; //каталог местоположения БД
    private String fnameAgents; // название файла с исходными данными об контрагентах
    private String fnameContacts; // название файла с исходными данными об контактах
    
    //контакты загружаем и сохраняем в данной модели,
    //потому что так удобнее подвязать контакты к контрагентам

    public AgentModel(String path_db, String fnameAgents, String fnameContacts) {
        this.path_db = path_db;
        this.fnameAgents = fnameAgents;
        this.fnameContacts = fnameContacts;
    }

    @Override
    public void add(Object rec) {
        // добавление новой записи в список agents
        agents.add((Agent) rec);
    }   

    @Override
    public void save() {
        // сохранение списка агентов в файл БД

    }

    @Override
    public List<Agent> load() {
        // загрузка списка агентов из файла БД в agents
        agents = new LinkedList<>();
        // открываем и читаем данные из файла об контрагентах
        try (FileReader fr = new FileReader(path_db + fnameAgents)) {
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
                            curAgent_type + " в исходном файле" + fnameAgents);
                            break;                         
                    }
                }
                i++;
            }
            scanner.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

        // открываем и читаем данные из файла об контактах
        //это делаем здесь потому что контакты связаны с контрагентами, подчиняются им
        /*try (FileReader fr = new FileReader(fnameAgents)) {
            Scanner scanner = new Scanner(fr);
            int i=0; //номер строки
            while (scanner.hasNextLine()) {
                //читаем строку исходного файла
                String curRow = scanner.nextLine();
                if (i>0) { // первую строку пропускаем, это шапка с названием полей
                    //расщепляем строку разделителем ; на поля
                    String[] fields = curRow.split(";");
                    int curId = Integer.parseInt(fields[0].trim());
                    String curContact_type = fields[1].trim();
                    int curAgentId = Integer.parseInt(fields[2].trim());
                    //находим объект агента по его id
                    Agent curAgent = getAgentById(curAgentId);
                    String curValue = fields[3].trim();
                    switch(curContact_type) {
                        case ("address"):
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
                            curAgent_type + " в исходном файле" + fnameAgents);
                            break;                         
                    }
                }
                i++;
            }
            scanner.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }*/

        return agents;
    }

    // возврат полного списка студентов без фильтрации и доп.упорядочивания
    public List<Agent> getAgentsAll() {
        return agents;
    }

    public Agent getAgentById(int curAgentId) {
        for (Agent item : agents) {
            if (item.getId() == curAgentId) return item;
            
        }
         
    }

    @Override
    public String toString() {
        String res = "";
        for (Agent item : agents) {
            res += item.toString();
        }
        return "Agents list: [" + res + "]";
    }
 
}
