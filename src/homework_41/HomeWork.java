package homework_41;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//Task 1.  Частотный словарь слов: Напишите метод, который принимает строку текста
//и возвращает Map<String, Integer>,
//где каждому слову соответствует количество его вхождений в текст.

public class HomeWork {
    public static void main(String[] args) {

        String string = "My name is Siysi, I like the Java programming language. " +
                "Java is the best programming language";
        System.out.println(FrequencyDictionary(string));
    }

    public static Map<String, Integer> FrequencyDictionary(String str) {

        str = str.trim().replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
        String[] words = str.split("\\s+");

        Map<String, Integer> stringCount = new LinkedHashMap<>();
        for (String word : words) {
            stringCount.put(word, stringCount.getOrDefault(word, 0) + 1);
        }
        return stringCount;
    }

}
