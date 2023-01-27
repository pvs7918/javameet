package OOP.seminar7.hw.classes;

import java.util.*;

public abstract class AgentA implements Agent {
    protected int id;
    protected String agentType;
    protected String fullname;
    List<Contact> contacts; //список контактов контрагента

    public AgentA(int id, String agentType, String fullname, List<Contact> contacts) {
        this.id = id;
        this.agentType = agentType;
        this.fullname = fullname;
        this.contacts = contacts;
    }
    
    public int getId() {
        return id;
    }
    
    public String getAgentType() {
        return agentType;
    }      

    public String getFullname() {
        return fullname;
    }
    
    public List<Contact> getContacts() {
        return contacts;
    }
    @Override
    public String toString() {
        return "Agent: id=" + id + ", type=" + agentType + ", fullname=" + fullname
         + ",\ncontacts=" + contacts + ",\n";
                
    }
}