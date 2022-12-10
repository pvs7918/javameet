package seminar6.lesson;

/*
1.	


 */
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;

public class task0 {
    public static void main(String[] args) {
        System.out.println(new HashSet<Integer>(List.of(6, 5, 1, 2, 3, 2, 4, 3)));
        System.out.println(new TreeSet<Integer>(List.of(6, 5, 1, 2, 3, 2, 4, 3)));
        System.out.println(new LinkedHashSet<Integer>(List.of(6, 5, 1, 2, 3, 2, 4, 3)));
    }
}
