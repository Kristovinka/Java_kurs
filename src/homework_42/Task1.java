package homework_42;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {

        String str1 = "Listen";
        String str2 = "Silent";
        String str3 = "hello";
        String str4 = "billion";

        System.out.print("\n“listen” и “silent”: ");
        if (areAnagrams(str1, str2)) {
            System.out.print("Строки являются анаграммой");
        } else {
            System.out.print("Строки НЕ являются анаграммой");
        }

        System.out.print("\n“hello” и “billion”: ");

        if (areAnagrams(str3, str4)) {
            System.out.print("Строки являются анаграммой");
        } else {
            System.out.print("Строки НЕ являются анаграммой");
        }

    }

    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        if (str1.length() != str2.length()) return false;

        Map<Character, Integer> charCountMap1 = getCharFrequencyMap(str1);
        Map<Character, Integer> charCountMap2 = getCharFrequencyMap(str2);

        return charCountMap1.equals(charCountMap2);

    }

    private static Map<Character, Integer> getCharFrequencyMap(String str1) {
        Map<Character, Integer> map = new HashMap<>();

        for (Character ch : str1.toCharArray()) {
            //Integer amount = map.getOrDefault(ch, 0);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        return map;
    }
}
