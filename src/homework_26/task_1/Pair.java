package homework_26.task_1;

//Требования:
//
//Класс должен иметь конструктор, принимающий два параметра типа T.
//Методы:
//T getFirst() — возвращает первый элемент.
//        T getSecond() — возвращает второй элемент.
//void setFirst(T value) — устанавливает значение первого элемента.
//void setSecond(T value) — устанавливает значение второго элемента.
//void swap() — меняет местами первый и второй элементы.


public class Pair<T> {
    private T value;
    private T value2;

    public Pair(T value, T value2) {
        this.value = value;
        this.value2 = value2;
    }

    public T getFirst() {
        return value;
    }

    public T getSecond() {
        return value2;
    }

    public void setFirst(T value) {
        this.value = value;
    }

    public void setSecond(T value2) {
        this.value2 = value2;
    }

    public void swap() {
        T swap = value2;
        this.value2 = value;
        this.value = swap;

    }
}
