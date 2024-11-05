package homework_39;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//Напишите метод, который принимает на вход
// две реализации интерфейса List.
//Метод должен возвращать список состоящий
// из элементов, которые присутствуют в обеих коллекциях.
public class home_work {
    public static void main(String[] args) {

        Collection<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(0, 1, 2, 3, 4, 5, 9, 1));
        System.out.println("numbers1: " + numbers);

        Collection<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll(List.of(7, 1, 9, 2, 4, 0));
        System.out.println("numbers2: " + numbers2);
        System.out.println( "arr.retainAll(arr2)" + method2(numbers, numbers2));

        Collection<String> colA = new ArrayList<>();
        Collection<String> colB = new ArrayList<>();
        colA.addAll(List.of("Java", "C#", "HTML", "Ruby", "Assembler", "C#"));
        colB.addAll(List.of("C++", "C#", "Java","Assembler"));
        System.out.println("colA: " + colA);
        System.out.println("colB: " + colB);
        System.out.println("colA.retainAll(colB): " + method2(colA,colB));

    }

    public static  <T> Collection<T> method2(Collection<T> arr, Collection<T> arr2){
        arr.retainAll(arr2);
        return arr;
    }


    public static Collection<Integer> method(Collection<Integer> arr, Collection<Integer> arr2){
        arr.retainAll(arr2);
        return arr;
    }
}
