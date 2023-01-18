package OOP.seminar5.hw;

import java.util.Comparator;

// компаратор для сортировки по убыванию списка студентов
    class StudentComparator implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            if (s1.getAttendancePercent() == s2.getAttendancePercent())
                return 0;
            else if (s1.getAttendancePercent() > s2.getAttendancePercent())
                return -1;
            else
                return 1;
        }
    }
