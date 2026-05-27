import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise21_1 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
        Set<String> set2 = new HashSet<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));

        System.out.println("Original set1: " + set1);
        System.out.println("Original set2: " + set2);

        Set<String> union = new HashSet<>();
        union.addAll(set1);
        union.addAll(set2);

        System.out.println("Union set: " + union);

        union = new HashSet<>(set1);
        union.removeAll(set2);
        System.out.println("difference se1 - set2: " + union);

        union = new HashSet<>(set2);
        union.removeAll(set1);
        System.out.println("difference se2 - set1: " + union);

        union = new HashSet<>(set1);
        union.retainAll(set2);
        System.out.println("intersection set: " + union);
    }
}
