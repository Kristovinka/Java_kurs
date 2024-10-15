package homework_23.paper;


public class Brush extends Pen{
    @Override
    void draw(String figure) {
        System.out.println("Кисть рисует фигуру: " + figure);
    }
}