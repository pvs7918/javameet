package seminar6.lesson.example;

import java.time.LocalDate;

public class Achivment {
    String title;
    String location;
    String sponsor;
    LocalDate dateExibition;
    int competitionPlace;
    public Achivment(String title, String location, String sponsor, LocalDate dateExibition, int competitionPlace) {
        this.title = title;
        this.location = location;
        this.sponsor = sponsor;
        this.dateExibition = dateExibition;
        this.competitionPlace = competitionPlace;
    }
    public String getTitle() {
        return title;
    }
    public String getLocation() {
        return location;
    }
    public String getSponsor() {
        return sponsor;
    }
    public LocalDate getDateExibition() {
        return dateExibition;
    }
    public int getCompetitionPlace() {
        return competitionPlace;
    }
    @Override
    public String toString() {
        return "Achivment [title=" + title + ", competitionPlace=" + competitionPlace + "]";
    }
    
    
    
}
