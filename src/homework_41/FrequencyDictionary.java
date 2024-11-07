package homework_41;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyDictionary {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
        System.out.println();
    }

    public static Map<Character, Integer> frequencyCharsDictionary(String str) {

        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);

        }

//        Map<Character, Integer> result = new HashMap<>();
//
//        for (char c : str.toCharArray()) {
//
//            Integer count = result.get(c);
//
//            if(count == null)
//                count = 0;
//
//            result.put(c,count + 1);
//        }

        return charCount;
    }
    public static Map<String, Integer> frequencyDictionary(String str) {

        str = str.trim().replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
        String[] words = str.split("\\s+");

        Map<String, Integer> stringCount = new LinkedHashMap<>();
        for (String word : words) {
            stringCount.put(word, stringCount.getOrDefault(word, 0) + 1);
        }
        return stringCount;
    }

}
