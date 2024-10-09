package homework_20.Task_2;

public class Tree extends Plant{

    private boolean fruit;

    public Tree(double height, String name, boolean fruit) {
        super(height, name);
        this.fruit = fruit;
    }

    public boolean isFruit() {
        return fruit;
    }
}
