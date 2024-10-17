package homework_26.task_2;

import lists.MyArrayList;

public class MagicArray<T,U> {

//    Напишите обобщенный статический метод printTwoLists, который принимает два
//    параметра типа MyArrayList и MyArrayList, и выводит элементы обоих списков.
//
//    Метод должен быть обобщенным по двум типам T и U.
//    Элементы списков могут быть разных типов.


    public void printTwoLists(MyArrayList<?> array) {
        for (T value : array) {
            System.out.println(value + " ");
        }
    }
}
