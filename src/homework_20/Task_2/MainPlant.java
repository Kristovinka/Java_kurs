package homework_20.Task_2;

public class MainPlant {
    public static void main(String[] args) {

        Tree tree = new Tree(33.5, "Dub", true);
        System.out.println(tree.toString());

        System.out.println("-------------------\n");
        Flower flower = new Flower(4.7, "Ambrosia", false);
        System.out.println(flower.toString());
    }
}
