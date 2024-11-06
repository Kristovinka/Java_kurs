package homework_40;

//Если строки имеют одинаковую длину - сортировать в естественном порядке
// Output:  [для, слов, строка, которые, Тестовая, удаления, повторяются]

import java.util.*;

public class StringUtil {

    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println( "testString: " + testString);
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }


    public static List<String> getUniqueSortedWords(String testStr) {
        if (testStr == null || testStr.isEmpty()) {
            return Collections.emptyList();
        }

        // Заменяем все не буквы на пустоту
        String newString = testStr.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
        System.out.println(newString);
//
//        // Преобразование строки в массив слов
//        String[] words = newString.split(" ");
//        System.out.println(Arrays.toString(words));
//        Arrays.sort(words, Comparator.comparingInt(String::length));
//
//        // Arrays.asList(T[] array) -> преобразует массив в коллекцию
//        List<String> list = Arrays.asList(words);

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(newString.split("\\s+")));
        List<String> sortedWords = new ArrayList<>(uniqueWords);

        // Сортируем по длине слова, а затем в лексикографическом порядке для слов одинаковой длины
        sortedWords.sort(Comparator.comparingInt(String::length)
                .thenComparing(Comparator.naturalOrder()));

        return sortedWords;
    }

}
