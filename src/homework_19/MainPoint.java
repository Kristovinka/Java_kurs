package homework_19;

public class MainPoint {

    public static void main(String[] args) {

        ImmutablePoint point = new ImmutablePoint(2,4);
        System.out.println("x= " + point.getX());
        System.out.println("y= " + point.getY());
        point.printMessage("Hallo");
    }
}