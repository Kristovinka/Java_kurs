package lesson_13;

/**
 * @author Sergey Bugaenko
 * {@code @date} 25.09.2024
 */

public class ArraysUtils {

    // Метод линейного поиска элемента в массиве
    // Осуществляется перебором всех элементов и сравниванием с искомым значением
    // Если значений найдено - возвращается индекс элемента массива
    // Если не найдено - возвращается -1

    // Однозначно сказать, что число отсутствует в массиве?
    // Потребуется перебрать абсолютно все элементы массива -> O(n)
    // O(n)

    public static int linearSearch(int[] array, int searchValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }

        return -1;
    }

    // Метод ищет минимальное значение по всему массиву и возвращает индекс min значения

    public static int minIndex(int[] array) {
        int min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }


    // Метод ищет минимальное значение в части массива от стартового индекса и до конца массива
    // возвращает индекс min значения

    public static int minIndex(int[] array, int startIndex) {
        int min = array[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Сортировка выбором
    /*
    Описания алгоритма сортировки:
    Выбирается минимальный элемент массива
    минимальное значение меняется местами с первым элементом
    Вторая итерация - выбирается мин элемент из оставшейся части массива
    меняется местами с первым из оставшихся.

     */


    public static void sortSelection(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int localMin = minIndex(array, i);

            int temp = array[i];
            array[i] = array[localMin];
            array[localMin] = temp;
        }
    }
}


















