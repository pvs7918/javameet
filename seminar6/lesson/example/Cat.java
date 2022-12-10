package seminar6.lesson.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cat {
    private String name;
    private String breed;
    private String ownerFullNAme;
    private LocalDate bithday;
    private Boolean isMale;
    private List<Achivment> achivments;
    
    public Cat(String name, String breed, String ownerFullNAme, LocalDate bithday, Boolean isMale) {
        this.name = name;
        this.breed = breed;
        this.ownerFullNAme = ownerFullNAme;
        this.bithday = bithday;
        this.isMale = isMale;
        this.achivments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getOwnerFullNAme() {
        return ownerFullNAme;
    }

    public LocalDate getBithday() {
        return bithday;
    }

    public Boolean getIsMale() {
        return isMale;
    }
    public void addAchivment(Achivment achivment) {
        achivments.add(achivment);
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", breed=" + breed + ", ownerFullNAme=" + ownerFullNAme + ", bithday=" + bithday
                + ", isMale=" + isMale + ", achivments=" + achivments + "]";
    }
    
}
