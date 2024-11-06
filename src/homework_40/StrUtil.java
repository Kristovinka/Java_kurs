package homework_40;

import java.util.HashMap;
import java.util.Map;

public class StrUtil {
    public static void main(String[] args) {
        String string = "abcdefj ab,cdf,";
        System.out.println( "неповторяющийся символ в строке: " + StrUtil.getFirstUniqueChar(string));
    }

    public static char getFirstUniqueChar(String str){

        //Подсчет количества вхождений символов
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            //Добавляет символ c в charCount и увеличивает его количество
            //Если символ уже есть в charCount, то его количество увеличивается на 1
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }

        return '\0'; // Если не найдены неповторяющиеся символы, возвращаем null-символ
    }

}
