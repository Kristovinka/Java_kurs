package homework_16;

public class MagicArray {
    int[] array;
    int cursor; // присвоено значение по умолчанию = 0;

    public MagicArray() {
        array = new int[10];
    }

    // Добавление в массив одного элемента
    void add (int value) {

        // Проверка. Есть ли вообще свободное место во внутреннем массиве
        // Если места нет - нужно добавить место
        if (cursor == array.length -1) {
            // Расширить массив перед добавлением нового элемента
            expandArray();
        }

        array[cursor] = value;
        cursor++;
    }

    void add(int... numbers) {
        // с numbers я могу обращаться точно также, как со ссылкой на массив int
        // System.out.println("Приняли несколько интов. А именно: " + numbers.length);
        // System.out.println("Есть индекс у каждого инта, как в массиве. По индексом 0: " + numbers[0]);
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }

    }


    // Динамическое расширение массива
    void expandArray() {
        System.out.println("Расширяем массив! Курсор = " + cursor);
        /*
        1. создать новый массив бОльшего размера (в 2 раза больше)
        2. Переписать в новый массив все значения из старого (до курсора)
        3. Перебросить ссылку
         */

        // 1
        int[] newArray = new int[array.length * 2];

        // 2
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i]; // Переписываю все значения из старого массива в новый
        }

        // Перебрасываем ссылку. Переменная array хранит ссылку на "новый" массив
        array = newArray;
        System.out.println("Расширение массива завершено");
    }

    // Возвращает строковое представление массива
    // [1, 14, 16]
    public String toString() {

        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + (i < cursor - 1 ? ", " : "]"); //", " / "]"
        }

        return result;
    }

    // Текущее количество элементов в массиве
    int size() {
        return cursor;
    }

    // Возвращает значение по индексу
    int get(int index) {
        if (index >=0 && index < cursor) {
            return array[index];
        }
        // Написать код, если индекс "не корректный"
        return Integer.MIN_VALUE; // Хорошего решения нет.
        //Todo Поправить обработку не корректного индекса

    }

    // Поиск элемента по значению indexOf
    int indexOf (int value) {
        for (int i = 0; i < cursor; i++) {
            if (value == array[i])
                return i;
        } System.out.println("Нет такого значения в массиве");
        return Integer.MIN_VALUE; // Хорошего решения нет.

    }

    // Удаление элемента по индексу
    int remove(int index) {
        if (index >=0 && index < cursor) {
            int j = 0;
            int del = array[index];
            int[] array2 = new int[cursor-2];

            for (int i = 0; i < cursor; i++) {
                if(i != index) { array2[j] = array[i];
                j++;}
            }
            array = array2;
            return del;
        }
        System.out.println("\n!!!!Нет такого indexa в массиве");
        return Integer.MIN_VALUE;
    }


}
