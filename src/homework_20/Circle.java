package homework_20;

public class Circle extends Shape{

    private double radius;
    public static final double PI = 3.141519;

    public Circle(String name) {
        super(name);
    }

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void calculateArea(){

        System.out.println("площадь круга: " + (PI * Math.pow(radius, 2)));
    }
}
