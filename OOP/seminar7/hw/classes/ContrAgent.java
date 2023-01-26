package OOP.seminar7.hw.classes;

import java.time.LocalDate;
import java.util.*;

public abstract class ContrAgent {
    private String fullName; //Полное название контрагента
    private String type; //тип контрагента: company, person
    private List<Contact> contacts; // список контактов контрагента


    public String getFullName() {
        return fullName;
    }

    public List<Contact> getcontacts() {
        return contacts;
    }

    public double getAttendancePercent() {
        double percent = 0.0;
        for (Contact contact : contacts) {
            if (contact.getParam2())
                percent++;
        }
        return 100 * percent / attendances.size();
    }

    public String getFioAndAttendancePercent() {
        return String.format("%s, %.1f%%", getFullName(), getAttendancePercent());
    }

    @Override
    public String toString() {
        String res = "\nStudent: FIO=" + fullName + ",\n";
        for (Pair<LocalDate, Boolean> attendance : attendances) {
            res += attendance.getParam1() + ", " + attendance.getParam2() + "\n";
        }
        return res;
    }

}
