package homework_42;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        String text = "Строка для подсчета слов с одинаковой длиной и вывода результата в консоль! Тест работы метода раз, два, три.";

        Map<Integer, Integer> wordLengths = countWordLengths(text);

        for (Map.Entry<Integer, Integer> entry : wordLengths.entrySet()) {
            System.out.println("Длина слова: " + entry.getKey() + ", количество слов: " + entry.getValue());
        }

    }

    public static Map<Integer, Integer> countWordLengths(String text) {
        Map<Integer, Integer> map = new HashMap<>();

        text = text.replaceAll("[^a-zа-яё ]", "");

        String[] words = text.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()){
                int length = word.length();

                map.merge(length, 1, Integer::sum);
//                map.merge(length, 1, (old, newValue) -> old + 1);
            }
        }
        return map;
    }
}
