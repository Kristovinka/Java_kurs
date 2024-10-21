package homework_28;

import java.util.List;
import java.util.Objects;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(length, rectangle.length) == 0 && Double.compare(width, rectangle.width) == 0;
    }

    public void removeDuplicates(List<Rectangle> list, Rectangle obj){
        int i = 0;
        while (!(list.get(i).equals(list.get(i + 1)))){
            if ((list.get(i).equals(list.get(i + 1)))) list.remove(i);
            i ++;
        }
    }

    @Override
    public String toString() {
        return "Прямоугольник {" +
                "длина= " + length +
                ", ширина= " + width +
                '}';
    }
}
