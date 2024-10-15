package homework_23.paper;

public class Eraser extends Pen{
    @Override
    void draw(String figure) {
        System.out.println("Стираю фигуру: " + figure);
    }
}