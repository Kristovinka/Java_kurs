package homework_20.Task_2;

public class Flower extends Plant{
    private boolean aroma;

    public Flower(double height, String name, boolean aroma) {
        super(height, name);
        this.aroma = aroma;
    }

    public boolean isAroma() {
        return aroma;
    }
}
