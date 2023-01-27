package OOP.seminar7.hw.classes;

import java.time.LocalDate;
import java.util.List;

public class AgentPerson extends AgentA {
    private LocalDate birthDate;

    public AgentPerson(int id, String agentType, String fullname, List<Contact> contacts, LocalDate birthDate) {
        super(id, agentType, fullname, contacts);
        this.birthDate = birthDate;
    }

    /*@Override
    public int getId() {
        return id;
    }*/

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return super.toString() + "birthDate=" + birthDate + ".";
    }    
}
