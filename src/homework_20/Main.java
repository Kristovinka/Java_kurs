package homework_20;

public class Main {
    public static void main(String[] args) {

        System.out.println(" \n    - Rectangle obj -  \n");
        Rectangle rectangle = new Rectangle("Rectangle");
        rectangle.setDimensions(2.4,3.5);
        rectangle.calculateArea();

        rectangle.setColor("read");
        rectangle.displayInfo();

        System.out.println("------------------------\n");

        System.out.println("    - Circle obj - \n");
        Circle circle = new Circle("Circle");

        circle.setRadius(9);
        circle.calculateArea();

        circle.setColor("black");
        circle.displayInfo();
    }
}
