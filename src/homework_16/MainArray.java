package homework_16;

    /*Добавление элемента
    Вывести все значения в массиве в консоль
    Поиск элемента по значению indexOf - (вернуть индекс, если такое значение есть в массиве)
    Возвращение значения по индексу
    Текущее количество элементов в массиве
    Удаление элемента по индексу remove
    Добавление нескольких элементов (в качестве аргументов передает
     последовательность значений)
    Конструктор, принимающий в себя обычный массив и создающий MagicArray с
     такими де значениями
    Удаление элемента по значению*/

public class MainArray {
    public static void main(String[] args) {

        MagicArray magicArray = new MagicArray();

        System.out.println(magicArray.toString());

        magicArray.add(100);
        magicArray.add(200);
        magicArray.add(300);

        System.out.println("Сейчас в массиве элементов: "  + magicArray.size());

        magicArray.add(500, 600, 700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500);
        System.out.println("---------------------------------");

        System.out.println(magicArray.toString());
        System.out.println("Возвращение значения по индексу 0: "  + magicArray.get(0));
        System.out.println("Поиск элемента по значению 1200, index = "  + magicArray.indexOf(1200));

        System.out.println("Удаление элемента по индексу 2, значениe = "  + magicArray.remove(2));
        System.out.println(magicArray.toString());


    }
}
