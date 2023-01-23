package OOP.seminar5.hw;

import java.time.LocalDate;
import java.util.*;

public class Student {
    private String fullName;
    private List<Pair<LocalDate, Boolean>> attendances; // посещаемость студента (дата, был/не был)

    public Student(String fullName, List<Pair<LocalDate, Boolean>> attendances) {
        this.fullName = fullName;
        this.attendances = attendances;
    }

    public String getFullName() {
        return fullName;
    }

    public List<Pair<LocalDate, Boolean>> getAttendances() {
        return attendances;
    }

    public double getAttendancePercent() {
        double percent = 0.0;
        for (Pair<LocalDate, Boolean> attendance : attendances) {
            if (attendance.getParam2())
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
