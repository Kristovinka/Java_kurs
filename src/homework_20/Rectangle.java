package homework_20;

import java.awt.*;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(String name) {
        super(name);
         }

    public void setDimensions(double width, double height){
        this.width = width;
        this.height = height;
    }
    public void calculateArea(){
        System.out.println("площадь прямоугольника: " + (width * height));
    }
}
