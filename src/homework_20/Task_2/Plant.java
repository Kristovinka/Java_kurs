package homework_20.Task_2;

public class Plant {

    private String name;
    private double height;

    public Plant(double height, String name) {
        this.height = height;
        this.name = name;
    }
    public  String toString(){
        return name + ", height is " + height;
    }
}
