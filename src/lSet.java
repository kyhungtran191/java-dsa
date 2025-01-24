import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class lSet {
    public static void main(String[] args) {
        TreeSet<Integer> listSet = new TreeSet<>(Comparator.reverseOrder());
        listSet.add(12);
        listSet.add(100);
        listSet.add(10);
        listSet.add(13);
        listSet.add(10210);
        System.out.println(listSet);
    }
}
