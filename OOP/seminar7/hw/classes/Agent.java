package OOP.seminar7.hw.classes;

import java.util.*;

public abstract class Agent {
    protected int id;
    protected String agentType;
    protected String fullname;
    List<Contact> contacts; //список контактов контрагента

    public Agent(int id, String agentType, String fullname, List<Contact> contacts) {
        this.id = id;
        this.agentType = agentType;
        this.fullname = fullname;
        if (contacts == null) 
            this.contacts = new LinkedList<>();
        else
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

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public boolean removeContact(int index) {
        if (index >=0 && index <contacts.size()) {
            contacts.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String res;
        res = "Agent: id=" + id + ", type=" + agentType + ", fullname=" + fullname
         + ",\n{ contacts: ";
        
        int i = 1;
        for(Contact item: contacts) {
            res += item.toString() + (i < contacts.size()?",\n":"}");
            i++;
        }
        return res;
    }
}