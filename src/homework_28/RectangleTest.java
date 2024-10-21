package homework_28;


import lists.MyArrayList;
import lists.MyList;

public class RectangleTest {
    public static void main(String[] args) {

        Rectangle rectangle0 = new Rectangle();
        System.out.println(rectangle0);

        Rectangle rectangle1 = new Rectangle(2.9,4.2);
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(2.9,4.2);
        System.out.println(rectangle2);
        System.out.println("rectangle1 = rectangle2: " + rectangle1.equals(rectangle2));
        System.out.println("rectangle = rectangle2: " + rectangle0.equals(rectangle2));

        ////////
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(5.0, 3.0);
        Rectangle rect3 = new Rectangle();

        System.out.println("rect1 = rect2: " + rect1.equals(rect2)); // Должно быть true
        System.out.println("rect1 = rect3: " + rect1.equals(rect3)); // Должно быть false

        // task 3


        MyList<Rectangle> rectangles = new MyArrayList<>();
        rectangles.add(new Rectangle(5.0, 3.0));
        rectangles.add(new Rectangle(4.0, 2.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат
        rectangles.add(new Rectangle(6.0, 4.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат

        System.out.println("Список до удаления дубликатов:");
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }

        Rectangle rectangleToRemove = new Rectangle(5.0, 3.0);
        RectangleUtils.removeDuplicates(rectangles, rectangleToRemove);

        System.out.println("\nСписок после удаления дубликатов:");
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }
    }
}
