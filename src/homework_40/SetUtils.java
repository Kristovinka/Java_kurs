package homework_40;

import java.util.*;

public class SetUtils {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

        System.out.println( "union(set1, set2): " + SetUtils.union(set1, set2));
        System.out.println( "intersection(set1, set2): " + SetUtils.intersection(set1, set2));
        System.out.println( "difference(set1, set2): " + SetUtils.difference(set1, set2));
    }

    public static Set<String> union(Set<String> set1, Set<String> set2) {

        Set<String> result1 = new HashSet<>(set1);
        result1.removeAll(set2);

        Set<String> result = new HashSet<>(result1);

        Set<String> result2 = new HashSet<>(set2);
        result2.removeAll(set1);
        result.addAll(result2);
        return result;
    }

    public static Set<String> intersection(Set<String> set1, Set<String> set2) {

        Set<String> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static Set<String> difference(Set<String> set1, Set<String> set2) {

        Set<String> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }

 }

