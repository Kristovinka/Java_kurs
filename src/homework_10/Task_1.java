package homework_10;
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5, 6};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите длину нового массива: ");
        int len  = scanner.nextInt();
        newArray(array, len);
    }

    public static void newArray (int[] array, int len){
        if (len == 0) {
            System.out.println("0 использовать нельзя! ");
            return ;
        }
        else {

            int[] newArr = new int[len];
            if (array.length <= newArr.length){


                System.out.print("массив : ");
                System.out.print("[");
                int i = 0;
                while (i < array.length) {
                    newArr[i] = array[i];
                    i++;
                }

                 i = 0;
                while (i < newArr.length) {
                     System.out.print(newArr[i] + ((i < newArr.length - 1) ? ", " : "]\n"));
                    i++;
                }
            } else {
                System.out.print("[");
                for (int i = 0; i < newArr.length; i ++){
                    newArr[i] = array[i];
                    System.out.print(newArr[i] + ((i < newArr.length - 1) ? ", " : "]\n"));
                }
            }

        }
    }

}
