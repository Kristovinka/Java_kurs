package homework_23.paper;

public class Pencil extends Pen{
    @Override
    void draw(String figure) {
        System.out.println("Рисую карандашом: " + figure);
    }
}